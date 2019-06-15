package com.imooc.hello5;

public class Test {

	public static void main(String[] args) {
		Cat one = new Cat();
		one.setName("麻子");
		one.setSpecies("中华田园猫");
		one.run();
		System.out.println("--------------------");
		
		Dog two = new Dog();
		two.setName("小黑");
		two.setMonth(3);
		two.sleep();
		

		one.eat();
		two.eat();
		
		
		
		

	}

}
