package com.bean;

import java.io.Serializable;

//测试的实体对像
public class OrderBean implements Serializable{
	private long oId;
	private int oMoney;// 订单总价格
	private long oUserId;// 订单用户id
	private String oCreateTime;// 订单创建时间表
	private byte oStatus;// 订单状态

	public long getoId() {
		return oId;
	}

	public void setoId(long oId) {
		this.oId = oId;
	}

	public int getoMoney() {
		return oMoney;
	}

	public void setoMoney(int oMoney) {
		this.oMoney = oMoney;
	}

	public long getoUserId() {
		return oUserId;
	}

	public void setoUserId(long oUserId) {
		this.oUserId = oUserId;
	}

	public String getoCreateTime() {
		return oCreateTime;
	}

	public void setoCreateTime(String oCreateTime) {
		this.oCreateTime = oCreateTime;
	}

	public byte getoStatus() {
		return oStatus;
	}

	public void setoStatus(byte oStatus) {
		this.oStatus = oStatus;
	}

}
