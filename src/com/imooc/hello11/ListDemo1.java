package com.imooc.hello11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//用ArrayList存储编程语言名称，并输出

		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("go");
		list.add("swift");

		//输出列表元素的个数
		System.out.println(list.size());
		//遍历输出所有的编程语言
		System.out.println("------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+",");
		}
		//移除列表中的c++
//		list.remove(2);
		list.remove("c++");
		System.out.println("------------");
		System.out.println("移除c++以后的列表元素");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+",");
		}
		
		
		
	}
	

	

}
