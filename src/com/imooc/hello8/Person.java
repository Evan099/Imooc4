package com.imooc.hello8;
//外部类
public class Person {
	 int age;
	
	public Heart getHeart() {
		return new Heart();
	}
	
	public void eat() {
		System.out.println("人会吃东西");
	}
	
	
	//内部类
//		class Heart{
//		  int age = 13;
//		 public String beat() {
//			 return new Person().age+"心脏在跳动";
//		 }
//	
//	}
	  
	//静态类
	  public static class Heart{
		 public static int age = 13;//静态成员
		 
		 public static void say() {
			 System.out.println("hello");	
		}
		 
		 
		 public String beat() {
		
			 new Person().eat();//(内部类中)调用外部类的方法
			 //静态内获取外部的变量：new一个类实例.对象名
//			 return age+"岁心脏在跳动";  //(内部类中)使用内部类的变量
			 return new Person().age+"岁心脏在跳动";  //(内部类中)使用外部类的变量
		 }
	
	}



	  
	
	
}
