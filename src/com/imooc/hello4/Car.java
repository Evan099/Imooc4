package com.imooc.hello4;

public class Car {
	//��Ա����
	private String name;
//	static:��̬ ��̬��Ա������ʵ�������ٶ��󣬶��ڱ�static�ı�����������һ��ռ�
	
	public static int price;
	
	String habbdy;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public static void move(String name) {
		System.out.println(name+"�ڼ�ʻ��");
		price = 12;

		System.out.println(price+name);
	}
	
	
	
}
