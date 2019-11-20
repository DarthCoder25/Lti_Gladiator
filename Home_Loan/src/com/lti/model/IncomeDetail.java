package com.lti.model;

public class IncomeDetail {

	private String userId;
	private String typeOfEmployment;
	
	
	public IncomeDetail() {
		super();
	
	}


	public IncomeDetail(String userId, String typeOfEmployment) {
		super();
		this.userId = userId;
		this.typeOfEmployment = typeOfEmployment;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}


	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}


	@Override
	public String toString() {
		return "IncomeDetail [userId=" + userId + ", typeOfEmployment=" + typeOfEmployment + "]";
	}
	
	

}
