package com.imooc.hello5;

<<<<<<< HEAD
 public class Animal {
	private String name;
	private int month;
	private String species;

	
	//添加无参构造方法
	public Animal() {
		
	}
	//添加有参构造方法
	public String getName() {
		return name;
	
=======
public class Animal {
	private String name;
	private int month;
	private String species;
	
	//添加无参构造方法
	public Animal() {
		
	}
	//添加有参构造方法
	public String getName() {
		return name;
>>>>>>> branch 'master' of https://github.com/Evan099/Imooc4.git
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
	
	//吃东西
	public void eat() {

		System.out.println(this.getName()+"在吃东西");
	}
	
	
	
	
	
	
	
	

}
