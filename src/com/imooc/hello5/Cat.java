package com.imooc.hello5;

public class Cat extends Animal{

	private double weight;//����
	//����޲ι��췽��
	public Cat() {
		
	}
	//����вι��췽��
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//����ܶ��ķ���
	public void run() {
		System.out.println(this.getName()+"��һֻ"+this.getSpecies()+"�����ڿ��ֵı���");
	}
	

	
	
	
	
}
