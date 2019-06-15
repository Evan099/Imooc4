package com.imooc.hello5;

public class Cat extends Animal{

	private double weight;//体重
	//添加无参构造方法
	public Cat() {
		
	}
	//添加有参构造方法
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//添加跑动的方法
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"，它在快乐的奔跑");
	}
	

	
	
	
	
}
