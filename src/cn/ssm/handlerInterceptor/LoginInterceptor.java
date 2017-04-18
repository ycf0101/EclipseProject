package cn.ssm.handlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.sys.QxUserCustom;

/**
 * ��¼������
 * 
 * @ģ�飺������
 * 
 * @���ߣ� Ԭ�ɷ�
 * @�������ڣ� 2017��3��29�� ����10:36:38
 * 
 * @�޸ļ�¼���޸�ʱ�䡢���ߡ�ԭ�򣩣�
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
		
		//��ȡ�����url��ַ
		String url = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/")+1);
		
		//�ж������ҳ���ǲ��ǹ�����ַ
		//�õ�ȫ�ֱ�������web.xml�����õĹ�����ַ��
		String excludeResource = request.getServletContext().getInitParameter("excludeResource");
		String requestActions [] = excludeResource.split(";");
 		for(String requestAction :requestActions){
			if(url.equals(requestAction))
				return true;
			//ĳЩjs��ͼƬ��������Ϣ������
			if(url.endsWith(requestAction))
				return true;
		}
		
		//�Ѿ���¼������
		HttpSession session = request.getSession();
		QxUserCustom qxUserCustom = (QxUserCustom) session.getAttribute("user");
		if(qxUserCustom!=null){
			return true;
		}
		String methodAction = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/")+1);
		System.out.println("ϵͳ��ʾ��������"+methodAction+"��sessionʧЧ����ת����¼ҳ��");
		//������ת����¼ҳ��
		request.getRequestDispatcher("/WEB-INF/jsp/sysInfo/login.jsp").forward(request, response);
		return false;
	}
}