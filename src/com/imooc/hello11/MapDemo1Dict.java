package com.imooc.hello11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDemo1Dict {
	
	public static void main(String[] args) {
		
		
		Map<String,String> animal = new HashMap<String,String>();
		
		
		System.out.println("���������鵥�ʶ�Ӧ��ע�ͣ�����ŵ�HashMap��");
		Scanner console = new Scanner(System.in);
		//�������
		int i =0;
		while(i<2) {
		System.out.println("������keyֵ�����ʣ�");
		String key = console.next();
		System.out.println("������valueֵ��ע�ͣ�");
		String value = console.next();
		animal.put(key, value);
		i++;
		}
		
		//��ӡ���value��ֵ��ֱ��ʹ�õ�������
		System.out.println("----------------");
		System.out.println("-------ʹ�õ������������value--------");
		Iterator<String> it = animal.values().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		System.out.println("---------------");
		//��ӡkey��value
		//ͨ��entrySet�������
		System.out.println("-------ʹ��entrySet�������key��valueֵ-----------");
		Set<Entry<String,String>> entrySet = animal.entrySet();
		
		for(Entry<String,String> entry:entrySet) {
			System.out.print(entry.getKey()+"-");
			System.out.println(entry.getValue());
		}
		
		System.out.println("---------------");
		System.out.println("-------������Ҫ���ҵĵ���-----------");
		//ͨ�������ҵ�ע�Ͳ����
		//ʹ��keySet����
		//1��ȡ��keySet
		String strSerch = console.next();
		Set<String> keySet = animal.keySet();
		//2������keySet
		for(String key:keySet) {
			if(strSerch.equals(key)) {
				System.out.println("�ҵ��ˣ���ֵ��Ϊ��"+key+"-"+animal.get(key));
			}
		}
		
		
		
	}


	
}
