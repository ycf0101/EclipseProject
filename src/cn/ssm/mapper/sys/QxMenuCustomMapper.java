package cn.ssm.mapper.sys;

import java.util.List;

import cn.ssm.po.sys.QxMenuCustom;
import cn.ssm.po.sys.QxUserCustom;

public interface QxMenuCustomMapper{
	/**�õ��˵�
	 */
	public List<QxMenuCustom> selectMenuByUser(QxUserCustom qxUserCustom) throws Exception;
}