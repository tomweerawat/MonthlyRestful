package th.co.hotum.monthlyreport.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Customer {

    int cust_id;
    String cust_frst_name;

    String cust_last_name;


    String cust_frst_name_en;
    String cust_last_name_en;
    String cust_img_url;
    String cust_emailIndex;
    String cust_mobl_noIndex;
    String cust_auth_id;
    String cust_usernameIndex;
    String 	cust_nation;
    String cust_pswd;
    String cust_stts;

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_frst_name() {
        return cust_frst_name;
    }

    public void setCust_frst_name(String cust_frst_name) {
        this.cust_frst_name = cust_frst_name;
    }

    public String getCust_last_name() {
        return cust_last_name;
    }

    public void setCust_last_name(String cust_last_name) {
        this.cust_last_name = cust_last_name;
    }

    public String getCust_frst_name_en() {
        return cust_frst_name_en;
    }

    public void setCust_frst_name_en(String cust_frst_name_en) {
        this.cust_frst_name_en = cust_frst_name_en;
    }

    public String getCust_last_name_en() {
        return cust_last_name_en;
    }

    public void setCust_last_name_en(String cust_last_name_en) {
        this.cust_last_name_en = cust_last_name_en;
    }

    public String getCust_img_url() {
        return cust_img_url;
    }

    public void setCust_img_url(String cust_img_url) {
        this.cust_img_url = cust_img_url;
    }

    public String getCust_emailIndex() {
        return cust_emailIndex;
    }

    public void setCust_emailIndex(String cust_emailIndex) {
        this.cust_emailIndex = cust_emailIndex;
    }

    public String getCust_mobl_noIndex() {
        return cust_mobl_noIndex;
    }

    public void setCust_mobl_noIndex(String cust_mobl_noIndex) {
        this.cust_mobl_noIndex = cust_mobl_noIndex;
    }

    public String getCust_auth_id() {
        return cust_auth_id;
    }

    public void setCust_auth_id(String cust_auth_id) {
        this.cust_auth_id = cust_auth_id;
    }

    public String getCust_usernameIndex() {
        return cust_usernameIndex;
    }

    public void setCust_usernameIndex(String cust_usernameIndex) {
        this.cust_usernameIndex = cust_usernameIndex;
    }

    public String getCust_nation() {
        return cust_nation;
    }

    public void setCust_nation(String cust_nation) {
        this.cust_nation = cust_nation;
    }

    public String getCust_pswd() {
        return cust_pswd;
    }

    public void setCust_pswd(String cust_pswd) {
        this.cust_pswd = cust_pswd;
    }

    public String getCust_stts() {
        return cust_stts;
    }

    public void setCust_stts(String cust_stts) {
        this.cust_stts = cust_stts;
    }

    public String getUpdt_dttm() {
        return updt_dttm;
    }

    public void setUpdt_dttm(String updt_dttm) {
        this.updt_dttm = updt_dttm;
    }

    String updt_dttm;

}