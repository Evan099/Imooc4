package com.imooc.hello9;

import java.util.Scanner;

public class TryDemoOne {
	int one;
	int two;
	

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
		
		}catch (Exception e) {
			System.out.println("���������~~~");
			e.printStackTrace();//չʾ�����쳣��ԭ�򣬳��ֵ�λ��������ģ�û�й̶�λ��
		}finally {//����catchִ����񣬶���ִ���������
			System.out.println("===�������===");
		}
		
		
		
		
		

	}

}
