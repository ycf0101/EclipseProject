package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xm")
public class XmController {
	
	/**
	 * 创建采购项目页面
	 * 
	 * @return
	 */
	@RequestMapping("/cjcgxm")
	public String getCjcgxmPage(){
		return "xm/cjcgxm";
	}

	/**
	 * 项目列表页面
	 * 
	 * @return
	 */
	@RequestMapping("/xmlb")
	public String getXmlbPage(){
		return "xm/xmlb";
	}
	
	/**
	 * 当前工作页面
	 * 
	 * @return
	 */
	@RequestMapping("/dqgz")
	public String getDqgzPage(){
		return "xm/dqgz";
	}
}
