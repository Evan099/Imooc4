package com.imooc.hello7;

public class Test{

	public static void main(String[] args) {
		FourPhone phone = new FourPhone();
		phone.call();
		phone.message();
		phone.video();
		phone.music();
		phone.call();
		phone.photo();
		phone.network();
		phone.game();
		
		System.out.println("------------");
		
		Iphoto ip = new FourPhone();
		ip.photo();
		
		ip = new Camera();
		ip.photo();
		
		System.out.println("------------");
		
		INet net = new SmartWatch();
		net.network();
	
	
		
		
		
		

	}

}
