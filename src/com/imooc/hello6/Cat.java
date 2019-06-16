package com.imooc.hello6;

public class Cat extends Animal{
	//属性：体重
	private double weight;
	//添加构造器
	public Cat() {
		
	}
	public Cat(String name,int month,double weight) {
		this.setMonth(month);
		this.setName(name);
		this.setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//方法：跑动
	public void run() {
		System.out.println("小猫在快乐的奔跑(自己的)");
	}

	//方法：吃东西（重写）
	public void eat() {
		System.out.println("猫在吃鱼(重写的)");
	}
	
	

	
	
	

}
