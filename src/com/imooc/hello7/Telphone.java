package com.imooc.hello7;


//ԭʼ�ֻ�
public class Telphone {
	private String brand;
	private int price;
	public Telphone() {
		
	}
	public Telphone(String brand,int price) {
		
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}
	
}
