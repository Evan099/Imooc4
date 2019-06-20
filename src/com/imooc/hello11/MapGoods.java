package com.imooc.hello11;

public class MapGoods {
	private String id;
	private String name;
	private double price;
	//构造方法
	public MapGoods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//封装
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "商品编号=" + id + ", 商品名称=" + name + ", 商品价格=" + price + "]";
	}
	
	
	
	
	
}
