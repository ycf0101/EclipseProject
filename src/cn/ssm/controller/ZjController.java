package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ����ר�ҿ�������
 * 
 * 
 * @���̣� EPS(1.0)
 * @ģ�飺 
 * 
 * @���ߣ� ������
 * @�������ڣ� 2017��4��13�� ����1:26:25
 * 
 * @�޸ļ�¼���޸�ʱ�䡢���ߡ�ԭ�򣩣�
 */

@Controller
@RequestMapping("/zj")
public class ZjController {
	
	/**
	 * ����Ϊ�˻�ȡר���Ƽ���ҳ��
	* 
	* 
	* @���ߣ� ������
	* @�������ڣ� 2017��4��13�� ����1:26:52
	* 
	* @����: 
	* @����ֵ: String
	* 
	* @�޸ļ�¼���޸�ʱ�䡢���ߡ�ԭ�򣩣�
	 */
	@RequestMapping("/zjtj")
	public String  getZjZcxzPage(){
		return "zj/zjzcxz";//ר��ע����֪
	}
	
	@RequestMapping("/zjzc")
	public String getZjzcPage(){
		return "zj/zjzc";
	}
}
