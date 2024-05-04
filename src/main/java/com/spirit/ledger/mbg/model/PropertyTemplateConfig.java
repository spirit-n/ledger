package com.spirit.ledger.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PropertyTemplateConfig implements Serializable {
    @ApiModelProperty(value = "主键id")
    private String id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "资产模板code")
    private String propertyTemplateCode;

    @ApiModelProperty(value = "用户名")
    private String propertyTemplateName;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;

    @ApiModelProperty(value = "是否删除,0-未删除,1-已删除")
    private String isDelete;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPropertyTemplateCode() {
        return propertyTemplateCode;
    }

    public void setPropertyTemplateCode(String propertyTemplateCode) {
        this.propertyTemplateCode = propertyTemplateCode;
    }

    public String getPropertyTemplateName() {
        return propertyTemplateName;
    }

    public void setPropertyTemplateName(String propertyTemplateName) {
        this.propertyTemplateName = propertyTemplateName;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", propertyTemplateCode=").append(propertyTemplateCode);
        sb.append(", propertyTemplateName=").append(propertyTemplateName);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}