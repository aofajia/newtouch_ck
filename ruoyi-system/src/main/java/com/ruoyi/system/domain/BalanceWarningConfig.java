package com.ruoyi.system.domain;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈余额预警配置信息〉
 *
 * @author aofajia
 * @create 2018/12/3
 * @since 1.0.0
 */

public class BalanceWarningConfig {


    private String id;

    private String configtype;

    private String configname;

    private String supplierid;

    private String paymethod;

    private BigDecimal warningmoney;

    private BigDecimal   monthlymoney;

    private String storeaccount;

    private String invoicetype;

    private String contacts;

    private String email;

    private String storebalanceurl;

    private String startdate;

    private String enddate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConfigtype(){
        return configtype;
    }

    public void setConfigtype(String configtype) {
        this.configtype = configtype;
    }

    public String getConfigname() {
        return configname;
    }

    public void setConfigName(String configname) {
        this.configname = configname;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public BigDecimal getWarningmoney() {
        return warningmoney;
    }

    public void setWarningmoney(BigDecimal warningmoney) {
        this.warningmoney = warningmoney;
    }

    public BigDecimal getMonthlymoney() {
        return monthlymoney;
    }

    public void setMonthlymoney(BigDecimal monthlymoney) {
        this.monthlymoney = monthlymoney;
    }

    public String getStoreaccount() {
        return storeaccount;
    }

    public void setStoreaccount(String storeaccount) {
        this.storeaccount = storeaccount;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStorebalanceurl() {
        return storebalanceurl;
    }

    public void setStorebalanceurl(String storebalanceurl) {
        this.storebalanceurl = storebalanceurl;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

}

