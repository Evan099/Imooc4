package com.imooc.hello8;
//�ⲿ��
public class Person {
	 int age;
	
	public Heart getHeart() {
		return new Heart();
	}
	
	public void eat() {
		System.out.println("�˻�Զ���");
	}
	
	
	//�ڲ���
//		class Heart{
//		  int age = 13;
//		 public String beat() {
//			 return new Person().age+"����������";
//		 }
//	
//	}
	  
	//��̬��
	  public static class Heart{
		 public static int age = 13;//��̬��Ա
		 
		 public static void say() {
			 System.out.println("hello");	
		}
		 
		 
		 public String beat() {
		
			 new Person().eat();//(�ڲ�����)�����ⲿ��ķ���
			 //��̬�ڻ�ȡ�ⲿ�ı�����newһ����ʵ��.������
//			 return age+"������������";  //(�ڲ�����)ʹ���ڲ���ı���
			 return new Person().age+"������������";  //(�ڲ�����)ʹ���ⲿ��ı���
		 }
	
	}



	  
	
	
}
