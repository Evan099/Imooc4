package com.imooc.hello11;

public class MapGoods {
	private String id;
	private String name;
	private double price;
	//���췽��
	public MapGoods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//��װ
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
		return "��Ʒ���=" + id + ", ��Ʒ����=" + name + ", ��Ʒ�۸�=" + price + "]";
	}
	
	
	
	
	
}
