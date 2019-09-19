package com.google.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADDRESS")

public class Address implements Serializable{
	@Id
	@Column(name="ADDR_ID")
	private Integer addId = null;
	@Column(name="H_NO")
	private Integer hNo = null;
	@Column(name="CITY")
	private String city = null;
	@Column(name="STATE")
	 private String state = null;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addId, Integer hNo, String city, String state) {
		super();
		this.addId = addId;
		this.hNo = hNo;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", hNo=" + hNo + ", city=" + city + ", state=" + state + "]";
	}
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public Integer gethNo() {
		return hNo;
	}
	public void sethNo(Integer hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
