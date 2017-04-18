package cn.ssm.exception;

/**
 * 自定义异常类
 * 
 * @模块： 异常
 * 
 * @作者： 袁成飞
 * @创建日期： 2017年3月29日 下午10:20:44
 * 
 * @修改记录（修改时间、作者、原因）：
 */
public class CustomException extends Exception{
	
	/**
	 * 添加序列号
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public CustomException(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
