package com.call.order.bean;

import java.util.Date;

public class Order {
	private Integer oid;

	private Integer onumber;

	private String oaddress;

	private String ophon;

	private String ormb;

	private Integer ozhuangtai;

	private Date otime;

	private Integer cUid;

	private Integer pPid;

	
	
	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getOnumber() {
		return onumber;
	}

	public void setOnumber(Integer onumber) {
		this.onumber = onumber;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress == null ? null : oaddress.trim();
	}

	public String getOphon() {
		return ophon;
	}

	public void setOphon(String ophon) {
		this.ophon = ophon == null ? null : ophon.trim();
	}

	public String getOrmb() {
		return ormb;
	}

	public void setOrmb(String ormb) {
		this.ormb = ormb == null ? null : ormb.trim();
	}

	public Integer getOzhuangtai() {
		return ozhuangtai;
	}

	public void setOzhuangtai(Integer ozhuangtai) {
		this.ozhuangtai = ozhuangtai;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public Integer getcUid() {
		return cUid;
	}

	public void setcUid(Integer cUid) {
		this.cUid = cUid;
	}

	public Integer getpPid() {
		return pPid;
	}

	public void setpPid(Integer pPid) {
		this.pPid = pPid;
	}
}