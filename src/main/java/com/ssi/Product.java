package com.ssi;

import org.springframework.beans.factory.InitializingBean;

public class Product {
	private String pcode;
	private String pname;
	
	public void showInfo(){
		System.out.println("PCode  : "+pcode);
		System.out.println("PName  : "+pname);
		System.out.println("_____________________________________________________________________");
	}
	public void start(){
		System.out.println("Inside Init of Product");
	}
	
	public Product(){
		System.out.println("Product Object Created");
	}



	public String getPcode() {
		return pcode;
	}



	public void setPcode(String pcode) {
		System.out.println("Setting Up PCode");
		this.pcode = pcode;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		System.out.println("Setting Up PName");
		this.pname = pname;
	
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + "]";
	}



	
	
}
