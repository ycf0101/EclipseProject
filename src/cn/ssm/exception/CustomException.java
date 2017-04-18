package cn.ssm.exception;

/**
 * �Զ����쳣��
 * 
 * @ģ�飺 �쳣
 * 
 * @���ߣ� Ԭ�ɷ�
 * @�������ڣ� 2017��3��29�� ����10:20:44
 * 
 * @�޸ļ�¼���޸�ʱ�䡢���ߡ�ԭ�򣩣�
 */
public class CustomException extends Exception{
	
	/**
	 * ������к�
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
