package com.imooc.hello11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet
//��Ӣ�ĵ�����ӵ�HashSet��
public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		//�򼯺������Ԫ��
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		//��ʾ���ϵ�����
		System.out.println("�����е�Ԫ��Ϊ��");
		Iterator<String> it = set.iterator();//��set�е����ݴ�ŵ���������
		//���������������Ԫ��
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println("----�ڵ������в���һ���ظ�Ԫ�ص�������-----");
		//�ڵ������в���һ������
		set.add("green");//���ظ�
		set.add("white");//�ظ�
		Iterator<String> its = set.iterator();//��set�е����ݴ�ŵ���������
		//���������������Ԫ��
		while(its.hasNext()) {
			System.out.println(its.next()+" ");
		}
		//�����ظ�Ԫ��ʱ����ʧ�ܣ����ǲ��ᱨ��
		

	}

}
