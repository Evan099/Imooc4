package com.imooc.hello9;

import java.util.Scanner;
/*throw抛出异常对象的处理方案：
 * 1、通过try catch包含throw语句，自己抛自己处理
 * 2、通过throws在方法声明出抛出异常类型，谁调用谁处理，具体看TryDemoFours
 */

public class TryDemoFour {

	public static void main(String[] args) {
		TestAge();

	}
	
	
	public static void TestAge() {
		try {
		System.out.println("请输入年龄");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<18 || age>80) {
			throw new Exception("18岁一下，80岁以上者的住客必须有亲友陪同");
		}else {
			System.out.println("欢迎入住");
		}
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
