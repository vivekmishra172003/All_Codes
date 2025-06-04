package com.bean;




public class Flat {

	private String flatId ;
	private int doorNumber ; 
	private String flatType ; 
	private double flatArea ; 
	private int numberOfRooms ; 
	private double flatPrice ;
	
	private Buyer buyer;

	public String getFlatId() {
		return flatId;
	}

	public void setFlatId(String flatId) {
		this.flatId = flatId;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public double getFlatArea() {
		return flatArea;
	}

	public void setFlatArea(double flatArea) {
		this.flatArea = flatArea;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getFlatPrice() {
		return flatPrice;
	}

	public void setFlatPrice(double flatPrice) {
		this.flatPrice = flatPrice;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	
	
}
