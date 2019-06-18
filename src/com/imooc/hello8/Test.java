package com.imooc.hello8;

public class Test {

	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 20;
		
//		成员内部类的获取
		/*
		//获取内部类对象实例，方式1：new 外部类.new 内部类
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//获取内部类对象实例，方式2：外部类对象.new 内部类
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//获取内部类对象实例，方式3：外部类对象.获取方法
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
		*/
//		静态内部类的获取
		Person.Heart myHeart = new Person.Heart();
		
		System.out.println(myHeart.beat());
		Person.Heart.say();

	}

}
