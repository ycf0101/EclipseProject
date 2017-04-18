package cn.ssm.handlerInterceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.commons.utils.CommonUilts;
import cn.ssm.po.sys.Log;
import cn.ssm.po.sys.QxUserCustom;
import cn.ssm.service.SysService;

public class LogInterceptor implements HandlerInterceptor{
	@Autowired
	private SysService sysService;
	
	Log log = null;
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {
		log = new Log();
		log.setLogid(CommonUilts.getUUID());
		
		if(request.getSession()!=null && request.getSession().getAttribute("user")!=null)
			log.setUsername(((QxUserCustom)request.getSession().getAttribute("user")).getLoginname());
		String methodAction = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/")+1);
		log.setOperation(methodAction.substring(0, methodAction.lastIndexOf(".")));
		if(ex == null)
			log.setResult("³É¹¦");
		else{
			log.setResult("Ê§°Ü");
			log.setRemark(ex.getMessage());
		}
		log.setCreatedate(new Date());
		sysService.insertLog(log);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

}
