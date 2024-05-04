package com.spirit.ledger.mbg.mapper;

import com.spirit.ledger.mbg.model.PropertyTemplateConfig;
import com.spirit.ledger.mbg.model.PropertyTemplateConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyTemplateConfigMapper {
    int countByExample(PropertyTemplateConfigExample example);

    int deleteByExample(PropertyTemplateConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(PropertyTemplateConfig record);

    int insertSelective(PropertyTemplateConfig record);

    List<PropertyTemplateConfig> selectByExample(PropertyTemplateConfigExample example);

    PropertyTemplateConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PropertyTemplateConfig record, @Param("example") PropertyTemplateConfigExample example);

    int updateByExample(@Param("record") PropertyTemplateConfig record, @Param("example") PropertyTemplateConfigExample example);

    int updateByPrimaryKeySelective(PropertyTemplateConfig record);

    int updateByPrimaryKey(PropertyTemplateConfig record);
}