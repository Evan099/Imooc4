package com.imooc.hello9;

import java.util.Scanner;

public class TryDemoFours {

	public static void main(String[] args) {
		try {
			TestAge();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void TestAge() throws Exception {

		System.out.println("请输入年龄");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<18 || age>80) {
			throw new Exception("18岁一下，80岁以上者的住客必须有亲友陪同");
		}else {
			System.out.println("欢迎入住");
		}

		
	}

}
