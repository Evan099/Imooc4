package com.imooc.hello7;

public interface INet {
//	接口中的抽象方法可以不写abstract关键字，访问修饰符默认public
//  当类实现接口时，需要取实现接口中的所有抽象方法，否则需要将该类设置为抽象类	!!!
	 void network();
//	 void connection();
	 
//	接口中可以包含常量，默认 public fanal static
	 
	 int temp = 20;
	 
//	 default:默认方法，可以带方法体  jdk1.8后
	 //可以在实现类中重写，并可以通过接口调用
	 default void connection() {
		 System.out.println("我是默认方法");
	 }
//	static:静态方法 可以带方法体
	 //不可以在实现类中重写，可以同接口名调用
	 static void stop() {
		 System.out.println("我是接口中的静态方法");
	 }
//	在接口中加了默认方法或者静态方法后就可以在引用这个接口的实现类中可以实现：1、不必每个方法都重写.；2，不必对该类定义抽象类abstract	 
//	 便可以满足只使用接口中的某些个别方法

	 
}
