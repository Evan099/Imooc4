package com.imooc.hello10;

public class WrapTestOne {

	public static void main(String[] args) {
		
		int t1 = 2;
		Integer t2 = t1;//自动装箱
		Integer t3 = new Integer(t1);//手动装箱
		System.out.println(t2 instanceof Number);
		
		
		
		int t4 = t2;//自动拆箱
		int t5 = t2.intValue();
		System.out.println(t5);
		
		

	}

}
