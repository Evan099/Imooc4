package com.imooc.hello8;

public class Test {

	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 20;
		
//		��Ա�ڲ���Ļ�ȡ
		/*
		//��ȡ�ڲ������ʵ������ʽ1��new �ⲿ��.new �ڲ���
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//��ȡ�ڲ������ʵ������ʽ2���ⲿ�����.new �ڲ���
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//��ȡ�ڲ������ʵ������ʽ3���ⲿ�����.��ȡ����
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
		*/
//		��̬�ڲ���Ļ�ȡ
		Person.Heart myHeart = new Person.Heart();
		
		System.out.println(myHeart.beat());
		Person.Heart.say();

	}

}
