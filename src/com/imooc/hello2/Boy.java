package com.imooc.hello2;

public class Boy {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <=0) {
			System.out.println("年龄必须大于0");
		}else {
			this.age = age;
		}
	
		
	}
	
	
	
	
	
	
	
	
	
//	public void playGame(String name) {
//		System.out.println(name+"：在偷偷玩游戏");
//	}
//	
//	public void playGirlFriend() {
//		System.out.println("泡妞");
//	}
//	
	
	
	
	
	
}
