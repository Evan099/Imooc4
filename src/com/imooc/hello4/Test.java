package com.imooc.hello4;

public class Test {

	public static void main(String[] args) {
		Car one = new Car();
		one.setName("����");
//		one.price = 290000;//ע�⣺������ʹ�ö��������õ�
		Car.price = 290000;//ע�⣺������ʹ���������õģ������Ӧ��ʹ����������

		
		Car two = new Car();
		two.setName("����");

		System.out.println(one.getName()+"���ۼۣ�"+Car.price+"��"+two.getName()+"���ۼۣ�"+Car.price);
		Car.move("����");

		
		
		
	}
	
	
	

}
