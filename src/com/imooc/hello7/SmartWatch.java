package com.imooc.hello7;

public class SmartWatch implements INet,Iphoto{


	@Override
	public void network() {
		System.out.println("�����ֱ��������");
		
	}
	
	public void connection() {
		INet.super.connection();//���ýӿ��е�Ĭ�Ϸ���
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	



}
