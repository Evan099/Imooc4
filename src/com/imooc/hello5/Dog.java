package com.imooc.hello5;

public class Dog extends Animal{
	private String sex;//性别
	//添加无参构造方法
	public Dog() {
		
	}
	//添加有参构造方法
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//添加睡觉的方法
	public void sleep() {
		System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，它在睡觉");
	}
	
	//重写

	public void eat() {
		System.out.println(this.getName()+"在偷吃");
		
	}
	
	
	//子类重写了父类方法后，无法访问父类的方法，但是可以调用父类的方法
	public static void main(String[] args) {
		Animal xx = new Animal();//调用父类方法
		xx.setName("xx");
		xx.eat();
		
		Dog bb = new Dog();//调用重写父类的方法
		bb.setName("bb");
		bb.eat();
				

		
		
	}
	
	

}
