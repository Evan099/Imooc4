package com.imooc.hello11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2CatTest {

	public static void main(String[] args) {
		//�������è����
		SetDemo2Cat huahua = new SetDemo2Cat("����",12,"Ӣ����ëè");
		SetDemo2Cat fanfan = new SetDemo2Cat("����",3,"�л���԰è");
		//������è�������HashSet��
		Set<Object> set = new HashSet<Object>();
		set.add(huahua);
		set.add(fanfan);
		//��ʾ����è��Ϣ
		Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----����ظ���Ϣ��ĳ���è��Ϣ------");
		//�����һ���뻨������һ����è
		SetDemo2Cat huahau01 = new SetDemo2Cat("����",12,"Ӣ����ëè");
		set.add(huahau01);
		//��ʾ����è��Ϣ
		Iterator<Object> its = set.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		//��д����һ���³���è
		SetDemo2Cat huahua02 = new SetDemo2Cat("��������",2,"Ӣ����ëè");
		set.add(huahua02);
		System.out.println("-----��ӻ���������ĳ���è��Ϣ-----");
		//��ʾ����è��Ϣ
		Iterator<Object> its2 = set.iterator();
		while(its2.hasNext()) {
			System.out.println(its2.next());
		}
		System.out.println("-----���һ����ĳ���è��Ϣ-----");
		//���һ�������Ϣ�����
		if(set.contains(huahua)) {
			System.out.println("�����ҵ���");
			System.out.println(huahua);
		}else {
			System.out.println("����û�ҵ�");
		}
		System.out.println("-----ʹ�����ֲ��һ����ĳ���è��Ϣ-----");
		//ʹ�����ֲ��һ�������Ϣ�����
		boolean flag = false;
		SetDemo2Cat c = null;
		
		Iterator<Object> its3 = set.iterator();
		
		while (its3.hasNext()) {
			c = (SetDemo2Cat)its3.next();
			if(c.getName().equals("����")) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("�ҵ���");
			System.out.println(c);
		}else {
			System.out.println("û�ҵ�");
		}
		//ɾ��������������Ϣ���������Ҫʹ�÷��ͣ�
		
		
		
		//ɾ�������е����г���è��Ϣ
		System.out.println("----------------");
	
		boolean flag1 = set.removeAll(set);
		if(flag1) {
			System.out.println("è�������ˣ���ɾ����");
		}else {
			System.out.println("è����");
		}
		
		
	}

}
