package com.mini.mall.mapper;

import com.mini.mall.model.MallRoleAuthorityDO;
import com.mini.mall.model.MallRoleAuthorityDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MallRoleAuthorityDOMapper {
    long countByExample(MallRoleAuthorityDOExample example);

    int deleteByExample(MallRoleAuthorityDOExample example);

    int insert(MallRoleAuthorityDO record);

    int insertSelective(MallRoleAuthorityDO record);

    List<MallRoleAuthorityDO> selectByExampleWithRowbounds(MallRoleAuthorityDOExample example, RowBounds rowBounds);

    List<MallRoleAuthorityDO> selectByExample(MallRoleAuthorityDOExample example);

    int updateByExampleSelective(@Param("record") MallRoleAuthorityDO record, @Param("example") MallRoleAuthorityDOExample example);

    int updateByExample(@Param("record") MallRoleAuthorityDO record, @Param("example") MallRoleAuthorityDOExample example);
}