package com.imooc.hello8;



//�����ڲ���
//����:���ݴ���Ĳ�ͬ���˵����ͣ����ö�Ӧ��read����
//����1�ͷ���2�ѽ�ʡ�ԣ�����ɿ���Ƶ������ֱ��ͨ�������ڲ�����ʵ������
public class Test2 {
	//����һ��getRead����
	public void getRead(Person2 person2) {
		person2.read();
	}
	

	public static void main(String[] args) {

		Test2 test = new Test2();
		
//		�����ڲ����ʵ��
		test.getRead(new Person2(){
			
			
			{//������ӹ�������
				System.out.println("���ǹ�������");
			}
			
			
		
			public void read() {
				System.out.println("����ϲ�����ƻ����鼮");
			}
			
			
		});
	
		
		

	}

}
