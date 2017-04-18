package cn.ssm.mapper.sys;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.ssm.po.sys.QxMenu;
import cn.ssm.po.sys.QxMenuExample;

public interface QxMenuMapper {
    int countByExample(QxMenuExample example);

    int deleteByExample(QxMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(QxMenu record);

    int insertSelective(QxMenu record);

    List<QxMenu> selectByExample(QxMenuExample example);

    QxMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QxMenu record, @Param("example") QxMenuExample example);

    int updateByExample(@Param("record") QxMenu record, @Param("example") QxMenuExample example);

    int updateByPrimaryKeySelective(QxMenu record);

    int updateByPrimaryKey(QxMenu record);
}