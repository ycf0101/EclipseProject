package cn.ssm.service;

import java.util.List;

import cn.ssm.po.sys.Log;
import cn.ssm.po.sys.LogVo;
import cn.ssm.po.sys.QxMenuCustom;
import cn.ssm.po.sys.QxUserCustom;

public interface SysService {
	
	/**��½ 
	 */
	public QxUserCustom selectUser(QxUserCustom qxUserCustom)throws Exception;
	
	/**�õ��˵�
	 */
	public List<QxMenuCustom> selectMenuByUser(QxUserCustom qxUserCustom) throws Exception;
	
	/**
	 * ������־
	 */
	public void insertLog(Log log) throws Exception;
	
	/**
	 * ���ݲ�ѯ�����õ���־�б�
	 */
	public List<Log> getLogList(LogVo logVo) throws Exception;
}