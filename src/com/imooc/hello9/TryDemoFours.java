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

		System.out.println("����������");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<18 || age>80) {
			throw new Exception("18��һ�£�80�������ߵ�ס�ͱ�����������ͬ");
		}else {
			System.out.println("��ӭ��ס");
		}

		
	}

}
