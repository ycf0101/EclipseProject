package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ssm.mapper.sys.LogMapper;
import cn.ssm.mapper.sys.QxMenuCustomMapper;
import cn.ssm.mapper.sys.QxUserMapper;
import cn.ssm.po.sys.Log;
import cn.ssm.po.sys.LogExample;
import cn.ssm.po.sys.LogVo;
import cn.ssm.po.sys.QxMenuCustom;
import cn.ssm.po.sys.QxUser;
import cn.ssm.po.sys.QxUserCustom;
import cn.ssm.po.sys.QxUserExample;
import cn.ssm.service.SysService;

public class SysServiceImpl implements SysService{

	@Autowired
	private QxMenuCustomMapper qxMenuCustomMapper;
	
	@Override
	public List<QxMenuCustom> selectMenuByUser(QxUserCustom qxUserCustom)
			throws Exception {
		List<QxMenuCustom> qxMenuList = qxMenuCustomMapper.selectMenuByUser(qxUserCustom);
		return qxMenuList;
	}

	@Autowired
	private LogMapper logMapper;
	
	/**
	 * 添加日志
	 */
	@Override
	public void insertLog(Log log) throws Exception {
		logMapper.insert(log);
	}
	
	/**
	 * 根据查询条件得到日志列表
	 */
	@Override
	public List<Log> getLogList(LogVo logVo) throws Exception {
		LogExample logExcample = new LogExample();
		if(logVo!=null && logVo.getEndTime()!=null && logVo.getStartTime()!=null)
			logExcample.createCriteria().andCreatedateBetween(logVo.getStartTime(), logVo.getEndTime());
		return logMapper.selectByExample(logExcample);
	}

	@Autowired
	private QxUserMapper qxUserMapper;
	
	/**登陆 
	 */
	@Override
	public QxUserCustom selectUser(QxUserCustom qxUserCustom) throws Exception {
		QxUserExample qxUserExample = new QxUserExample();
		qxUserExample.createCriteria().andLoginnameEqualTo(qxUserCustom.getLoginname()).andLoginpasswordEqualTo(qxUserCustom.getLoginpassword());
		List<QxUser> userList = qxUserMapper.selectByExample(qxUserExample);
		if(userList.size()>0){
			BeanUtils.copyProperties((QxUser) userList.get(0), qxUserCustom);
			return qxUserCustom;
		}
		else
			return null;
	}
}
