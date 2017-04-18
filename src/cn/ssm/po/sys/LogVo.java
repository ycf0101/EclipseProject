package cn.ssm.po.sys;

import java.util.Date;

/**
 * 查询显示包装实体类
 * 
 * @author 袁成飞
 * @date 2017年4月1日
 */
public class LogVo {

	private Log log;
	
	private Date startTime;
	
	private Date endTime;
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}
}
