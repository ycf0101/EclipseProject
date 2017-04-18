package cn.ssm.mapper.sys;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.ssm.po.sys.QxUser;
import cn.ssm.po.sys.QxUserExample;

public interface QxUserMapper {
    int countByExample(QxUserExample example);

    int deleteByExample(QxUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(QxUser record);

    int insertSelective(QxUser record);

    List<QxUser> selectByExample(QxUserExample example);

    QxUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QxUser record, @Param("example") QxUserExample example);

    int updateByExample(@Param("record") QxUser record, @Param("example") QxUserExample example);

    int updateByPrimaryKeySelective(QxUser record);

    int updateByPrimaryKey(QxUser record);
}