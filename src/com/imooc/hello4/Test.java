package com.imooc.hello4;

public class Test {

	public static void main(String[] args) {
		Car one = new Car();
		one.setName("奔驰");
//		one.price = 290000;//注意：这里是使用对象名调用的
		Car.price = 290000;//注意：这里是使用类名调用的，正规的应该使用类名调用

		
		Car two = new Car();
		two.setName("宝马");

		System.out.println(one.getName()+"：售价："+Car.price+"；"+two.getName()+"：售价："+Car.price);
		Car.move("张三");

		
		
		
	}
	
	
	

}
