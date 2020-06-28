package com.example.test.ch2;

import java.beans.ConstructorProperties;

public class Company {

	private String companyName;

	private String companyAddress;

	private int houseNo;

//	@ConstructorProperties({"companyAddress","companyName","houseNo"})
	public Company(String companyAddress,String companyName,int houseNo){
		this.companyAddress	= companyAddress;
		this.companyName = companyName;
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Company{" +
				"companyName='" + companyName + '\'' +
				", companyAddress='" + companyAddress + '\'' +
				", houseNo=" + houseNo +
				'}';
	}

	public static class Staff{
		private String staffName;

		public Staff(){

		}

		public Staff(String staffName){
			this.staffName = staffName;
		}

		public void testMethod(){
			System.out.println("test method");
		}
	}


}
