package com.imooc.hello12;

public class ArrayDemo {
	
	public static void main(String[] args) {
		//������ʽ1���Ƽ�ʹ�ô���
//		int[] intArray = new int[4];
//		int[] intArrays = {1,6,9,4};
		
		//������ʽ2
		//������������Ҫ��ʼ������
		
		int intArray[] = new int[4];
		int intArrays[] = {1,6,9,4};
		System.out.println(intArray.length);
		for (int i = 0; i < intArrays.length; i++) {
			System.out.print(intArrays[i]);
		}
		
		
	}

}
