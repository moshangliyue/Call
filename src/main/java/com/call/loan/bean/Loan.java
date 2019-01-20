package com.call.loan.bean;

public class Loan {
    private Integer lid;

    private Integer lnumber;

    private Integer lqishu;

    private Integer lzhuangtai;

    private String lperson;

    private Integer pid;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getLnumber() {
        return lnumber;
    }

    public void setLnumber(Integer lnumber) {
        this.lnumber = lnumber;
    }

    public Integer getLqishu() {
        return lqishu;
    }

    public void setLqishu(Integer lqishu) {
        this.lqishu = lqishu;
    }

    public Integer getLzhuangtai() {
        return lzhuangtai;
    }

    public void setLzhuangtai(Integer lzhuangtai) {
        this.lzhuangtai = lzhuangtai;
    }

    public String getLperson() {
        return lperson;
    }

    public void setLperson(String lperson) {
        this.lperson = lperson == null ? null : lperson.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}