package com.imooc.hello5;

public class Animal {
	private String name;
	private int month;
	private String species;
	
	//����޲ι��췽��
	public Animal() {
		
	}
	//����вι��췽��
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	//�Զ���
	public void eat() {

		System.out.println(this.getName()+"�ڳԶ���");
	}
	
	
	
	
	
	
	
	

}
