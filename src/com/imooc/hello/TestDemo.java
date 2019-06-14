package com.imooc.hello;

public class TestDemo {

	public static void main(String[] args) {
		//在main方法中完成对象实例化操作
		
		
		Man person1 = new Man();
		person1.name = "李四";
		person1.Fight(person1.name);
		person1.smoking(person1.name);
		
		Man person2 = new Man();
		person2.name = "张三";
		person2.Fight(person2.name);
		person2.smoking(person2.name);





	}

}
