package com.imooc.hello11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapGoodsTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//����HashMap����
		Map<String,Goods> goodsMap = new HashMap<String,Goods>();
		System.out.println("������������Ʒ��Ϣ");
		int i = 0;
		while(i<3) {
			System.out.println("������"+(i+1)+"����Ʒ��Ϣ��");
			System.out.println("��������Ʒ���");
			String goodsId = console.next();
		}
		
		
		

	}

}
