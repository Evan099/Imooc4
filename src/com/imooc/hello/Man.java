package com.imooc.hello;

public class Man {
	//成员属性
	String name;
	int age;
	double weight;
	
	
	public Man(){
		System.out.println("我是无参构造方法");
	}
	
	//成员方法
	public void Fight(String name){
		System.out.println(name+":上战场");
	}
	
	public void smoking(String name) {
		System.out.println(name+":抽烟");
	}
	
	
	
	
	
}
