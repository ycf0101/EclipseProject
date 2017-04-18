package cn.ssm.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.sys.Log;
import cn.ssm.po.sys.LogVo;
import cn.ssm.po.sys.QxMenuCustom;
import cn.ssm.po.sys.QxUserCustom;
import cn.ssm.service.SysService;

/**
 * 登录，退出
 * 主页面，iframe包含页面
 * 
 * @模块： 系统控制器
 * 
 * @作者： 袁成飞
 * @创建日期： 2017年3月29日 下午10:57:00
 * 
 * @修改记录（修改时间、作者、原因）：
 */
@Controller
@RequestMapping("/sys")
public class SysController {
	
	@Autowired
	private SysService sysService;
	/**进入主页面
	 */
	@RequestMapping("/index")
	public ModelAndView index(HttpSession session)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		if(session.getAttribute("username")!=null)
			modelAndView.addObject("username",session.getAttribute("username").toString());
		modelAndView.setViewName("sysInfo/index");
		return modelAndView;
	}

	
	/**登录方法
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request,QxUserCustom qxUserCustom,HttpSession session,String yzm)throws Exception{
		/*if(!yzm.equalsIgnoreCase(session.getAttribute("YZM").toString())){
			request.setAttribute("loginMessage", "验证码错误。");
			return "sysInfo/login";
		}*/
		qxUserCustom = sysService.selectUser(qxUserCustom);
		if(qxUserCustom!=null){
			session.setAttribute("user", qxUserCustom);
			return "redirect:index.action";
		}
		else{
			request.setAttribute("loginMessage", "用户名或密码错误。");
			return "sysInfo/login";
		}
	}
	
	/**身份授权
	 */
	@RequestMapping("/getMenu")
	public @ResponseBody List<QxMenuCustom> getMenu(HttpSession session) throws Exception{
		 List<QxMenuCustom> qxMenuCustom = sysService.selectMenuByUser((QxUserCustom)session.getAttribute("user"));
		 return qxMenuCustom;
	}

	/**退出方法
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:index.action";		
	}
	
	/**iframe包含页面
	 */
	@RequestMapping("/home")
	public String home()throws Exception{
		return "sysInfo/home";
	}
	
	/**
	 * 日志管理
	 */
	@RequestMapping("/logManage")
	public ModelAndView logManage(LogVo logVo) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Log> logList = sysService.getLogList(logVo);
		modelAndView.addObject("logManage",logList);
		modelAndView.setViewName("sysInfo/logManage");
		return modelAndView;
	}
	
	/**得到验证码
	 */
	@RequestMapping("/yzm")
	public void yzm(HttpServletRequest request,HttpServletResponse response) throws Exception{
		// 1. 常见内存画板对象
		BufferedImage img = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		// 2. 创建基于该画板的画笔
		Graphics g = img.getGraphics();
		Random r = new Random();
		// 3. 设定画笔的颜色
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		// 4. 设定画板背景的颜色
		g.fillRect(0, 0, 100, 30);
		// 5. 使用画笔的绘制方法绘制随机内容
		String str = getRandomStr(5);
		// 将验证码的内容保存到session
		request.getSession().setAttribute("YZM", str);
		g.setColor(new Color(0, 0, 0));
		g.setFont(new Font(null, Font.BOLD, 24));
		g.drawString(str, 5, 25);
		// 6. 更改画笔颜色
		// 7. 绘制随机的两点一线的干扰线
		for (int i = 0; i < 8; i++) {
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100),
					r.nextInt(30));
		}
		// 8. 绘制完成后将图片压缩并输出到客户端
		response.setContentType("image/jpeg");
		OutputStream os = response.getOutputStream();
		ImageIO.write(img, "jpeg", os);
		os.close();
	}
	
	private String getRandomStr(int size) {
		String number = "";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for (int i = 0; i < size; i++) {
			number += str.charAt((int) (Math.random() * str.length()));
		}
		return number;
	}
}
