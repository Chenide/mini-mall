package com.mini.mall.mapper;

import com.mini.mall.model.MallRoleDO;
import com.mini.mall.model.MallRoleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MallRoleMapper {
    long countByExample(MallRoleDOExample example);

    int deleteByExample(MallRoleDOExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(MallRoleDO record);

    int insertSelective(MallRoleDO record);

    List<MallRoleDO> selectByExampleWithRowbounds(MallRoleDOExample example, RowBounds rowBounds);

    List<MallRoleDO> selectByExample(MallRoleDOExample example);

    MallRoleDO selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") MallRoleDO record, @Param("example") MallRoleDOExample example);

    int updateByExample(@Param("record") MallRoleDO record, @Param("example") MallRoleDOExample example);

    int updateByPrimaryKeySelective(MallRoleDO record);

    int updateByPrimaryKey(MallRoleDO record);
}