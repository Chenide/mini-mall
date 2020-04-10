package com.mini.mall.mapper;

import com.mini.mall.model.MallAdminUserDO;
import com.mini.mall.model.MallAdminUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MallAdminUserMapper {
    long countByExample(MallAdminUserDOExample example);

    int deleteByExample(MallAdminUserDOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(MallAdminUserDO record);

    int insertSelective(MallAdminUserDO record);

    List<MallAdminUserDO> selectByExampleWithRowbounds(MallAdminUserDOExample example, RowBounds rowBounds);

    List<MallAdminUserDO> selectByExample(MallAdminUserDOExample example);

    MallAdminUserDO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") MallAdminUserDO record, @Param("example") MallAdminUserDOExample example);

    int updateByExample(@Param("record") MallAdminUserDO record, @Param("example") MallAdminUserDOExample example);

    int updateByPrimaryKeySelective(MallAdminUserDO record);

    int updateByPrimaryKey(MallAdminUserDO record);
}