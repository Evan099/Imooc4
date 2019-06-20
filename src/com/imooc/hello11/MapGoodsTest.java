package com.imooc.hello11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapGoodsTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//定义HashMap对象
		Map<String,Goods> goodsMap = new HashMap<String,Goods>();
		System.out.println("请输入三条商品信息");
		int i = 0;
		while(i<3) {
			System.out.println("请输入"+(i+1)+"条商品信息：");
			System.out.println("请输入商品编号");
			String goodsId = console.next();
		}
		
		
		

	}

}
