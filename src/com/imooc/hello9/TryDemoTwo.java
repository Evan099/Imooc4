package com.imooc.hello9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

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
		
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0~~~");
			e.printStackTrace();
		}catch (InputMismatchException e) {
//			System.exit(1);
			System.out.println("请输入整数~~~");
			e.printStackTrace();
		}catch (Exception e) {//防止前面没有捕获到，避免漏网之鱼，在最后定义一个收入囊中
			System.out.println("程序出错了~~~");
			e.printStackTrace();
		}
		finally {//无论catch执行与否，都会执行这里面的
			System.out.println("===运算结束===");
		}
		

	}

}
