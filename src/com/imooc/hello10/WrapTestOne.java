package com.imooc.hello10;

public class WrapTestOne {

	public static void main(String[] args) {
		
		int t1 = 2;
		Integer t2 = t1;//�Զ�װ��
		Integer t3 = new Integer(t1);//�ֶ�װ��
		System.out.println(t2 instanceof Number);
		
		
		
		int t4 = t2;//�Զ�����
		int t5 = t2.intValue();
		System.out.println(t5);
		
		

	}

}
