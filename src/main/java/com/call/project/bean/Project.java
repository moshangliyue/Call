package com.call.project.bean;

import java.util.Date;

public class Project {
    private Integer pid;

    private String pname;

    private String pintro;

    private String ptypes;

    private Integer pamount;

    private Date pstart;

    private Date pend;

    private String pimg;

    private String pdetail;

    private String pcomname;

    private String pcomphon;

    private String pbank;

    private String pbanknumber;

    private String phtypes;

    private Integer phamount;

    private String phcontent;

    private Integer phnumberpeople;

    private Integer phday;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPintro() {
        return pintro;
    }

    public void setPintro(String pintro) {
        this.pintro = pintro == null ? null : pintro.trim();
    }

    public String getPtypes() {
        return ptypes;
    }

    public void setPtypes(String ptypes) {
        this.ptypes = ptypes == null ? null : ptypes.trim();
    }

    public Integer getPamount() {
        return pamount;
    }

    public void setPamount(Integer pamount) {
        this.pamount = pamount;
    }

    public Date getPstart() {
        return pstart;
    }

    public void setPstart(Date pstart) {
        this.pstart = pstart;
    }

    public Date getPend() {
        return pend;
    }

    public void setPend(Date pend) {
        this.pend = pend;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail == null ? null : pdetail.trim();
    }

    public String getPcomname() {
        return pcomname;
    }

    public void setPcomname(String pcomname) {
        this.pcomname = pcomname == null ? null : pcomname.trim();
    }

    public String getPcomphon() {
        return pcomphon;
    }

    public void setPcomphon(String pcomphon) {
        this.pcomphon = pcomphon == null ? null : pcomphon.trim();
    }

    public String getPbank() {
        return pbank;
    }

    public void setPbank(String pbank) {
        this.pbank = pbank == null ? null : pbank.trim();
    }

    public String getPbanknumber() {
        return pbanknumber;
    }

    public void setPbanknumber(String pbanknumber) {
        this.pbanknumber = pbanknumber == null ? null : pbanknumber.trim();
    }

    public String getPhtypes() {
        return phtypes;
    }

    public void setPhtypes(String phtypes) {
        this.phtypes = phtypes == null ? null : phtypes.trim();
    }

    public Integer getPhamount() {
        return phamount;
    }

    public void setPhamount(Integer phamount) {
        this.phamount = phamount;
    }

    public String getPhcontent() {
        return phcontent;
    }

    public void setPhcontent(String phcontent) {
        this.phcontent = phcontent == null ? null : phcontent.trim();
    }

    public Integer getPhnumberpeople() {
        return phnumberpeople;
    }

    public void setPhnumberpeople(Integer phnumberpeople) {
        this.phnumberpeople = phnumberpeople;
    }

    public Integer getPhday() {
        return phday;
    }

    public void setPhday(Integer phday) {
        this.phday = phday;
    }
}