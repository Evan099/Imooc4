package com.imooc.hello5;

public class Test {

	public static void main(String[] args) {
		Cat one = new Cat();
		one.setName("����");
		one.setSpecies("�л���԰è");
		one.run();
		System.out.println("--------------------");
		
		Dog two = new Dog();
		two.setName("С��");
		two.setMonth(3);
		two.sleep();
		

		one.eat();
		two.eat();
		
		
		
		

	}

}
