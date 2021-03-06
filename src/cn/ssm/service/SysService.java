package cn.ssm.service;

import java.util.List;

import cn.ssm.po.sys.Log;
import cn.ssm.po.sys.LogVo;
import cn.ssm.po.sys.QxMenuCustom;
import cn.ssm.po.sys.QxUserCustom;

public interface SysService {
	
	/**登陆 
	 */
	public QxUserCustom selectUser(QxUserCustom qxUserCustom)throws Exception;
	
	/**得到菜单
	 */
	public List<QxMenuCustom> selectMenuByUser(QxUserCustom qxUserCustom) throws Exception;
	
	/**
	 * 添加日志
	 */
	public void insertLog(Log log) throws Exception;
	
	/**
	 * 根据查询条件得到日志列表
	 */
	public List<Log> getLogList(LogVo logVo) throws Exception;
}
