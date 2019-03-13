package com.ssi;

public class Supplier {
	private String scode;
	private String sname;
	
	public Supplier(){
		System.out.println("Supplier Object Created");
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		System.out.println("Setting Up SCode");
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("Setting Up SName");
	}
	
	
	
	
}
