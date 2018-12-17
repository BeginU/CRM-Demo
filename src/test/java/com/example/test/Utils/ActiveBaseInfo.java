package com.example.test.Utils;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动基础信息（裂变营销相关）
 *
 * @author xieming
 * @version 1.0
 * @create 2018-08-16 15:22
 **/
public class ActiveBaseInfo implements Serializable {

    /**
     * 活动id
     */
    private Integer activeId;
    /**
     * 活动名称
     */
    @Validated(isNotNull = true,description = "活动名称不能为空")
    private String activeName;
    /**
     * 活动类型
     */
    @Validated(isNotNull = true,description = "活动类型不能为空")
    private Integer activeType;
    /**
     * 商户id
     */
    private Integer merchantId;
    /**
     * 活动开始日期
     */
    private Date activeBegin;
    /**
     * 活动结束日期
     */
    private Date activeEnd;
    /**
     * 创建人
     */
   // @Validated(isNotNull = true)
    private String creator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String modifier;
    /**
     * 更新时间
     */
    private Date modified;
    /**
     * 活动状态
     */
    //@Validated(isNotNull = true)
    private Short status;

    /**
     * 持续时间类型
     **/
    private Integer usefulTimeType;

    /**
     * 持续时间
     **/
    private Integer usefulTime;

    /**
     * 商标图片
     **/
    //@Validated(isNotNull = true)
    private String logoUrl;

    /**
     * 分享标题
     **/
   // @Validated(isNotNull = true)
    private String subHead;

    /**
     * 缩略图地址
     **/
   // @Validated(isNotNull = true)
    private String thumbnailUrl;

    /**
     * 活动规则
     **/
   // @Validated(isNotNull = true)
    private String activeDesc;

    /**
     * 活动介绍
     **/
   // @Validated(isNotNull = true)
    private String activeExplain;

    /**
     * 冗余字段
     */
    private String remark;

    @Validated(isNotNull = true,description = "ceshi")
    private List<String> ceshi;

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public Integer getActiveType() {
        return activeType;
    }

    public void setActiveType(Integer activeType) {
        this.activeType = activeType;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Date getActiveBegin() {
        return activeBegin;
    }

    public void setActiveBegin(Date activeBegin) {
        this.activeBegin = activeBegin;
    }

    public Date getActiveEnd() {
        return activeEnd;
    }

    public void setActiveEnd(Date activeEnd) {
        this.activeEnd = activeEnd;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUsefulTimeType() {
        return usefulTimeType;
    }

    public Integer getUsefulTime() {
        return usefulTime;
    }

    public Integer getActiveId() {
        return activeId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getSubHead() {
        return subHead;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getActiveDesc() {
        return activeDesc;
    }

    public String getActiveExplain() {
        return activeExplain;
    }

    public void setUsefulTimeType(Integer usefulTimeType) {
        this.usefulTimeType = usefulTimeType;
    }

    public void setUsefulTime(Integer usefulTime) {
        this.usefulTime = usefulTime;
    }

    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public void setSubHead(String subHead) {
        this.subHead = subHead;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setActiveDesc(String activeDesc) {
        this.activeDesc = activeDesc;
    }

    public void setActiveExplain(String activeExplain) {
        this.activeExplain = activeExplain;
    }

    public List<String> getCeshi() {
        return ceshi;
    }

    public void setCeshi(List<String> ceshi) {
        this.ceshi = ceshi;
    }
}
