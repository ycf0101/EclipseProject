package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xm")
public class XmController {
	
	/**
	 * �����ɹ���Ŀҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/cjcgxm")
	public String getCjcgxmPage(){
		return "xm/cjcgxm";
	}

	/**
	 * ��Ŀ�б�ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/xmlb")
	public String getXmlbPage(){
		return "xm/xmlb";
	}
	
	/**
	 * ��ǰ����ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/dqgz")
	public String getDqgzPage(){
		return "xm/dqgz";
	}
}
