package com.hlz.app.merchant_info.model;

import java.io.Serializable;

public class MerchantJob implements Serializable {
    /**
     * 商家id，设为uuid
     */
   private String  merchantId;
    /**
     * 商家名称
     */
   private String merchantName;
    /**
     * 商家地址
     */
   private String merchantAddress;
    /**
     * 营业执照编号
     */
   private String businessLicens;
    /**
     * 联系人手机号
     */
   private String phoneNum;
    /**
     * 联系人
     */
   private String principal;
    /**
     * 招聘岗位
     */
   private String job;
    /**
     * 招聘人数
     */
   private String peopleCount;
    /**
     * 职位描述
     */
   private String jobRequire;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getBusinessLicens() {
        return businessLicens;
    }

    public void setBusinessLicens(String businessLicens) {
        this.businessLicens = businessLicens;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(String peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getJobRequire() {
        return jobRequire;
    }

    public void setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire;
    }
}
