package com.imooc.hello11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//��ArrayList�洢����������ƣ������

		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("go");
		list.add("swift");

		//����б�Ԫ�صĸ���
		System.out.println(list.size());
		//����������еı������
		System.out.println("------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+",");
		}
		//�Ƴ��б��е�c++
//		list.remove(2);
		list.remove("c++");
		System.out.println("------------");
		System.out.println("�Ƴ�c++�Ժ���б�Ԫ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+",");
		}
		
		
		
	}
	

	

}
