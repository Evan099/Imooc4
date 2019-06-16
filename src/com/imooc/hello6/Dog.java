package com.imooc.hello6;

public class Dog extends Animal{
	//属性：性别
	private String sex;
	//添加构造器
	public Dog() {
		
	}
	public Dog(String name,int month,String sex) {
		this.setMonth(month);
		this.setName(name);
		this.setSex(sex);
		
	}
	//添加set get
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	//方法：睡觉
	public void sleep() {
		System.out.println("小狗有午睡的习惯(自己的)");
	}
	
	
	//方法：吃东西（重写）
	public void eat() {
		System.out.println("狗在吃肉(重写的)");
	}
	
	
}
