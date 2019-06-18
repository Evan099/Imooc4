package com.imooc.hello9;

import java.util.Scanner;

public class TryDemoOne {
	int one;
	int two;
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("===运算开始===");
		
		try {
		
		System.out.println("请输入第一个数字：");
		int one = input.nextInt();
		System.out.println("请输入第二个数字：");
		int two = input.nextInt();
		System.out.println("one和two的商的结果："+(one/two));
		
		}catch (Exception e) {
			System.out.println("程序出错了~~~");
			e.printStackTrace();//展示出错异常的原因，出现的位置是随机的，没有固定位置
		}finally {//无论catch执行与否，都会执行这里面的
			System.out.println("===运算结束===");
		}
		
		
		
		
		

	}

}
