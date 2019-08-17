package com.zhb.bean.customers;

import java.util.Date;

public class TCustomers {
    private Integer id;

    private String name;

    private String wechat;

    private Date birthday;

    private String mobile;

    private String sex;

    private Integer expendPerday;

    private String feddingPattern;

    private String isTrial;

    private String purchaseIntention;

    private String remark;

    private String guideId;

    private String buyIntention;

    private String isCommunication;

    private Integer updateBy;

    private String ds;

    private String isStatus;

    private Date creatTime;

    private Date updateTime;

    private String dataFrom;

    private Integer crmId;

    public TCustomers(Integer id, String name, String wechat, Date birthday, String mobile, String sex, Integer expendPerday, String feddingPattern, String isTrial, String purchaseIntention, String remark, String guideId, String buyIntention, String isCommunication, Integer updateBy, String ds, String isStatus, Date creatTime, Date updateTime, String dataFrom, Integer crmId) {
        this.id = id;
        this.name = name;
        this.wechat = wechat;
        this.birthday = birthday;
        this.mobile = mobile;
        this.sex = sex;
        this.expendPerday = expendPerday;
        this.feddingPattern = feddingPattern;
        this.isTrial = isTrial;
        this.purchaseIntention = purchaseIntention;
        this.remark = remark;
        this.guideId = guideId;
        this.buyIntention = buyIntention;
        this.isCommunication = isCommunication;
        this.updateBy = updateBy;
        this.ds = ds;
        this.isStatus = isStatus;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
        this.dataFrom = dataFrom;
        this.crmId = crmId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getExpendPerday() {
        return expendPerday;
    }

    public void setExpendPerday(Integer expendPerday) {
        this.expendPerday = expendPerday;
    }

    public String getFeddingPattern() {
        return feddingPattern;
    }

    public void setFeddingPattern(String feddingPattern) {
        this.feddingPattern = feddingPattern == null ? null : feddingPattern.trim();
    }

    public String getIsTrial() {
        return isTrial;
    }

    public void setIsTrial(String isTrial) {
        this.isTrial = isTrial == null ? null : isTrial.trim();
    }

    public String getPurchaseIntention() {
        return purchaseIntention;
    }

    public void setPurchaseIntention(String purchaseIntention) {
        this.purchaseIntention = purchaseIntention == null ? null : purchaseIntention.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId == null ? null : guideId.trim();
    }

    public String getBuyIntention() {
        return buyIntention;
    }

    public void setBuyIntention(String buyIntention) {
        this.buyIntention = buyIntention == null ? null : buyIntention.trim();
    }

    public String getIsCommunication() {
        return isCommunication;
    }

    public void setIsCommunication(String isCommunication) {
        this.isCommunication = isCommunication == null ? null : isCommunication.trim();
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds == null ? null : ds.trim();
    }

    public String getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(String isStatus) {
        this.isStatus = isStatus == null ? null : isStatus.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }

    public Integer getCrmId() {
        return crmId;
    }

    public void setCrmId(Integer crmId) {
        this.crmId = crmId;
    }
}