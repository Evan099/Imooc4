package com.imooc.hello7;

public class SmartWatch implements INet,Iphoto{


	@Override
	public void network() {
		System.out.println("智能手表可以上网");
		
	}
	
	public void connection() {
		INet.super.connection();//调用接口中的默认方法
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	



}
