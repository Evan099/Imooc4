package com.imooc.hello6;

public class Dog extends Animal{
	//���ԣ��Ա�
	private String sex;
	//��ӹ�����
	public Dog() {
		
	}
	public Dog(String name,int month,String sex) {
		this.setMonth(month);
		this.setName(name);
		this.setSex(sex);
		
	}
	//���set get
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	//������˯��
	public void sleep() {
		System.out.println("С������˯��ϰ��(�Լ���)");
	}
	
	
	//�������Զ�������д��
	public void eat() {
		System.out.println("���ڳ���(��д��)");
	}
	
	
}
