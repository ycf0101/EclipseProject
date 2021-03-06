package cn.ssm.handlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.sys.QxUserCustom;

/**
 * 登录拦截器
 * 
 * @模块：拦截器
 * 
 * @作者： 袁成飞
 * @创建日期： 2017年3月29日 下午10:36:38
 * 
 * @修改记录（修改时间、作者、原因）：
 */
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		
		//获取请求的url地址
		String url = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/")+1);
		
		//判断请求的页面是不是公开地址
		//得到全局变量，在web.xml中配置的公开地址。
		String excludeResource = request.getServletContext().getInitParameter("excludeResource");
		String requestActions [] = excludeResource.split(";");
 		for(String requestAction :requestActions){
			if(url.equals(requestAction))
				return true;
			//某些js，图片，其他信息。。。
			if(url.endsWith(requestAction))
				return true;
		}
		
		//已经登录，放行
		HttpSession session = request.getSession();
		QxUserCustom qxUserCustom = (QxUserCustom) session.getAttribute("user");
		if(qxUserCustom!=null){
			return true;
		}
		String methodAction = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/")+1);
		System.out.println("系统提示：将访问"+methodAction+"，session失效，跳转到登录页面");
		//否则，跳转到登录页面
		request.getRequestDispatcher("/WEB-INF/jsp/sysInfo/login.jsp").forward(request, response);
		return false;
	}
}
