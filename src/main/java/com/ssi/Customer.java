package com.ssi;

import org.springframework.beans.factory.InitializingBean;

public class Customer {
	private int code;
	private String cname;
	
	public void start(){
		System.out.println("Inside Init of Customer");
	}
	
	public Customer() {
		System.out.println("Customer Object Created");
	}
	
	public void showInfo(){
		System.out.println("Code  : "+code);
		System.out.println("Name  : "+cname);
		System.out.println("_____________________________________________________________________");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		System.out.println("Setting Up Code");
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		System.out.println("Setting Up Name");
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + "]";
	}

	
	
	
}
