package com.imooc.hello6;

public class Cat extends Animal{
	//���ԣ�����
	private double weight;
	//��ӹ�����
	public Cat() {
		
	}
	public Cat(String name,int month,double weight) {
		this.setMonth(month);
		this.setName(name);
		this.setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//�������ܶ�
	public void run() {
		System.out.println("Сè�ڿ��ֵı���(�Լ���)");
	}

	//�������Զ�������д��
	public void eat() {
		System.out.println("è�ڳ���(��д��)");
	}
	
	

	
	
	

}
