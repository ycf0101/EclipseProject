package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 这是专家控制器类
 * 
 * 
 * @工程： EPS(1.0)
 * @模块： 
 * 
 * @作者： 周瑞彦
 * @创建日期： 2017年4月13日 下午1:26:25
 * 
 * @修改记录（修改时间、作者、原因）：
 */

@Controller
@RequestMapping("/zj")
public class ZjController {
	
	/**
	 * 这是为了获取专家推荐的页面
	* 
	* 
	* @作者： 周瑞彦
	* @创建日期： 2017年4月13日 下午1:26:52
	* 
	* @参数: 
	* @返回值: String
	* 
	* @修改记录（修改时间、作者、原因）：
	 */
	@RequestMapping("/zjtj")
	public String  getZjZcxzPage(){
		return "zj/zjzcxz";//专家注册须知
	}
	
	@RequestMapping("/zjzc")
	public String getZjzcPage(){
		return "zj/zjzc";
	}
}
