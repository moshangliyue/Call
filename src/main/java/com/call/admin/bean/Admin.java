package com.call.admin.bean;

import java.util.Date;

public class Admin {
    private Integer aid;

    private Integer atypes;

    private Date astarttime;

    private Date aendtime;

    private Integer aphon;

    private Integer aper;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAtypes() {
        return atypes;
    }

    public void setAtypes(Integer atypes) {
        this.atypes = atypes;
    }

    public Date getAstarttime() {
        return astarttime;
    }

    public void setAstarttime(Date astarttime) {
        this.astarttime = astarttime;
    }

    public Date getAendtime() {
        return aendtime;
    }

    public void setAendtime(Date aendtime) {
        this.aendtime = aendtime;
    }

    public Integer getAphon() {
        return aphon;
    }

    public void setAphon(Integer aphon) {
        this.aphon = aphon;
    }

    public Integer getAper() {
        return aper;
    }

    public void setAper(Integer aper) {
        this.aper = aper;
    }
}