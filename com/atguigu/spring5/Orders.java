package com.atguigu.spring5;

public class Orders {

	private String oname;
	private String address;
	public Orders(String oname,String address) {
		// TODO Auto-generated constructor stub
		this.oname = oname;
		this.address = address;
	}
	
	public void ordersTest() {
		System.out.println(oname+"::" +address);
	}
}
