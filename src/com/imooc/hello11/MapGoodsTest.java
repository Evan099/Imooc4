package com.imooc.hello11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapGoodsTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//����HashMap����
		Map<String,MapGoods> goodsMap = new HashMap<String,MapGoods>();

		
		int i = 0;
		while(i<3) {
			System.out.println("�������"+(i+1)+"����Ʒ��Ϣ��");
			System.out.println("��������Ʒ���");
			String goodsId = console.next();
			//�ж���Ʒ���id�Ƿ����
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("����Ʒ����Ѿ����ڣ�����������");
				continue;//������ǰѭ��������ѭ����ȥ
			}
			
			System.out.println("��������Ʒ����");
			String goodName = console.next();
			System.out.println("��������Ʒ�۸�");
			double goodsPrice = 0;
			
			try {
				goodsPrice = console.nextDouble();
			} catch (Exception e) {
				System.out.println("�۸��ʽ����ȷ������������");
				console.next();
				continue;
			}
			
			
			
			MapGoods goods = new MapGoods(goodsId, goodName, goodsPrice);
			//����Ʒ��Ϣ��ӵ�HashMap
			goodsMap.put(goodsId,goods);
			i++;
			}
		//����Map,�����Ʒ��Ϣ
		System.out.println("��Ʒ��ȫ����ϢΪ��");
		Iterator<MapGoods> itGoods = goodsMap.values().iterator();
		while (itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
		
		
		

	}

}
