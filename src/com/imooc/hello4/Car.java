package com.imooc.hello4;

public class Car {
	//成员变量
	private String name;
//	static:静态 静态成员，无论实例化多少对象，对于被static的变量，都共用一块空间
	
	public static int price;
	
	String habbdy;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public static void move(String name) {
		System.out.println(name+"在驾驶中");
		price = 12;

		System.out.println(price+name);
	}
	
	
	
}
