package com.imooc.hello9;

import java.util.Scanner;
/*throw�׳��쳣����Ĵ�������
 * 1��ͨ��try catch����throw��䣬�Լ����Լ�����
 * 2��ͨ��throws�ڷ����������׳��쳣���ͣ�˭����˭�������忴TryDemoFours
 */

public class TryDemoFour {

	public static void main(String[] args) {
		TestAge();

	}
	
	
	public static void TestAge() {
		try {
		System.out.println("����������");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<18 || age>80) {
			throw new Exception("18��һ�£�80�������ߵ�ס�ͱ�����������ͬ");
		}else {
			System.out.println("��ӭ��ס");
		}
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
