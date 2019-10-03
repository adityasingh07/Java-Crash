package com.mydemos.pojo;

public class Customer {
	String custName;
	String custLastName;
	String custId;
	String address;
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String custName, String custLastName, String address) {
		super();
		this.custName = custName;
		this.custLastName = custLastName;
		this.address = address;
	}

		@Override
		public String toString() {

		return getCustName()+" "+getCustLastName()+" "+getCustId()+" "+getAddress();

		}




}
