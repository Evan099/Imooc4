package com.imooc.hello11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet
//将英文单词添加到HashSet中
public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		//向集合中添加元素
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		//显示集合的内容
		System.out.println("集合中的元素为：");
		Iterator<String> it = set.iterator();//把set中的数据存放到迭代器中
		//遍历迭代器并输出元素
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println("----在迭代器中插入一个重复元素的输出结果-----");
		//在迭代器中插入一个单词
		set.add("green");//非重复
		set.add("white");//重复
		Iterator<String> its = set.iterator();//把set中的数据存放到迭代器中
		//遍历迭代器并输出元素
		while(its.hasNext()) {
			System.out.println(its.next()+" ");
		}
		//插入重复元素时，会失败，但是不会报错
		

	}

}
