package com.call.permiss.bean;

public class Permiss {
    private Integer peid;

    private String pename;

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }

    public String getPename() {
        return pename;
    }

    public void setPename(String pename) {
        this.pename = pename == null ? null : pename.trim();
    }
}