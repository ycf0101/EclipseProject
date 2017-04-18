package cn.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomHandlerExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		CustomException customException = null;
		if(ex instanceof CustomException)
			customException = (CustomException) ex;
		else
			customException = new CustomException("Î´Öª´íÎó£º"+ex.getMessage());
		String message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",message);
		modelAndView.setViewName("sysInfo/error");
		return modelAndView;
	}

	
}
