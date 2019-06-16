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
	@Override
	public void eat() {
		System.out.println(this.getName()+"在偷吃(重写的)");
		
	}
	
	
	//子类重写了父类方法后，无法访问父类的方法，但是可以调用父类的方法
	public static void main(String[] args) {

		Animal xx = new Animal();//可以调用父类方法，但不能访问父类方法，如果需要访问需要加super
		xx.setName("xx");
		xx.eat();
		
		Dog bb = new Dog();//调用重写父类的方法
		bb.setName("bb");
		bb.eat();


		
		
	}
	
	

}
