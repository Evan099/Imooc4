package com.imooc.hello9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("===���㿪ʼ===");
		
		try {
		
		System.out.println("�������һ�����֣�");
		int one = input.nextInt();
		System.out.println("������ڶ������֣�");
		int two = input.nextInt();
		System.out.println("one��two���̵Ľ����"+(one/two));
		
		}catch (ArithmeticException e) {
			System.out.println("��������Ϊ0~~~");
			e.printStackTrace();
		}catch (InputMismatchException e) {
//			System.exit(1);
			System.out.println("����������~~~");
			e.printStackTrace();
		}catch (Exception e) {//��ֹǰ��û�в��񵽣�����©��֮�㣬�������һ����������
			System.out.println("���������~~~");
			e.printStackTrace();
		}
		finally {//����catchִ����񣬶���ִ���������
			System.out.println("===�������===");
		}
		

	}

}
