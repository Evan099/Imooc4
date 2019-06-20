package com.imooc.hello11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2CatTest {

	public static void main(String[] args) {
		//定义宠物猫对象
		SetDemo2Cat huahua = new SetDemo2Cat("花花",12,"英国短毛猫");
		SetDemo2Cat fanfan = new SetDemo2Cat("凡凡",3,"中华田园猫");
		//将宠物猫对象放入HashSet中
		Set<Object> set = new HashSet<Object>();
		set.add(huahua);
		set.add(fanfan);
		//显示宠物猫信息
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----添加重复信息后的宠物猫信息------");
		//再添加一个与花花属性一样的猫
		SetDemo2Cat huahau01 = new SetDemo2Cat("花花",12,"英国短毛猫");
		set.add(huahau01);
		//显示宠物猫信息
		Iterator<Object> its = set.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		//重写插入一个新宠物猫
		SetDemo2Cat huahua02 = new SetDemo2Cat("花花二代",2,"英国短毛猫");
		set.add(huahua02);
		System.out.println("-----添加花花二代后的宠物猫信息-----");
		//显示宠物猫信息
		Iterator<Object> its2 = set.iterator();
		while(its2.hasNext()) {
			System.out.println(its2.next());
		}
		System.out.println("-----查找花花的宠物猫信息-----");
		//查找花花的信息并输出
		if(set.contains(huahua)) {
			System.out.println("花花找到了");
			System.out.println(huahua);
		}else {
			System.out.println("花花没找到");
		}
		System.out.println("-----使用名字查找花花的宠物猫信息-----");
		//使用名字查找花花的信息并输出
		boolean flag = false;
		SetDemo2Cat c = null;
		
		Iterator<Object> its3 = set.iterator();
		
		while (its3.hasNext()) {
			c = (SetDemo2Cat)its3.next();
			if(c.getName().equals("花花")) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了");
			System.out.println(c);
		}else {
			System.out.println("没找到");
		}
		//删除花花二代的信息并输出（需要使用泛型）
		
		
		
		//删除集合中的所有宠物猫信息
		System.out.println("----------------");
	
		boolean flag1 = set.removeAll(set);
		if(flag1) {
			System.out.println("猫都不见了，被删除了");
		}else {
			System.out.println("猫还在");
		}
		
		
	}

}
