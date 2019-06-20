package com.imooc.hello11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapGoodsTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//定义HashMap对象
		Map<String,MapGoods> goodsMap = new HashMap<String,MapGoods>();

		
		int i = 0;
		while(i<3) {
			System.out.println("请输入第"+(i+1)+"条商品信息：");
			System.out.println("请输入商品编号");
			String goodsId = console.next();
			//判断商品编号id是否存在
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("该商品标号已经存在，请重新输入");
				continue;//结束当前循环，继续循环下去
			}
			
			System.out.println("请输入商品名称");
			String goodName = console.next();
			System.out.println("请输入商品价格");
			double goodsPrice = 0;
			
			try {
				goodsPrice = console.nextDouble();
			} catch (Exception e) {
				System.out.println("价格格式不正确，请重新输入");
				console.next();
				continue;
			}
			
			
			
			MapGoods goods = new MapGoods(goodsId, goodName, goodsPrice);
			//将商品信息添加到HashMap
			goodsMap.put(goodsId,goods);
			i++;
			}
		//遍历Map,输出商品信息
		System.out.println("商品的全部信息为：");
		Iterator<MapGoods> itGoods = goodsMap.values().iterator();
		while (itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
		
		
		

	}

}
