package com.bean;

import java.util.ArrayList;
import java.util.List;




public class Buyer {
	
	private String buyerId;
	private String buyerName;
	private String buyerContactNumber;
	
	
	private List<Flat> flatList=new ArrayList<Flat>();

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerContactNumber() {
		return buyerContactNumber;
	}

	public void setBuyerContactNumber(String buyerContactNumber) {
		this.buyerContactNumber = buyerContactNumber;
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	
	
	
}
