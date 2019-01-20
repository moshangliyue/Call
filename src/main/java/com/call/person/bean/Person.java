package com.call.person.bean;

public class Person {
    private Integer pid;

    private String plocation;

    private String paddress;

    private String pzipcode;

    private String pname;

    private String pphon;

    private String pdianhua;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation == null ? null : plocation.trim();
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress == null ? null : paddress.trim();
    }

    public String getPzipcode() {
        return pzipcode;
    }

    public void setPzipcode(String pzipcode) {
        this.pzipcode = pzipcode == null ? null : pzipcode.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPphon() {
        return pphon;
    }

    public void setPphon(String pphon) {
        this.pphon = pphon == null ? null : pphon.trim();
    }

    public String getPdianhua() {
        return pdianhua;
    }

    public void setPdianhua(String pdianhua) {
        this.pdianhua = pdianhua == null ? null : pdianhua.trim();
    }
}