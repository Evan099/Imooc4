package com.imooc.hello11;

import java.util.ArrayList;
import java.util.Date;

public class ListDemo2NoticeTest {

	public static void main(String[] args) {
		//����notice��Ķ�������3������
		ListDemo2Notice notice1 = new ListDemo2Notice(1, "��ӭ����Ľ����", "����Ա", new Date());
		ListDemo2Notice notice2 = new ListDemo2Notice(2, "��ͬѧ�ǰ�ʱ�ύ��ҵ", "��ʦ", new Date());
		ListDemo2Notice notice3 = new ListDemo2Notice(3, "����֪ͨ", "��ʦ", new Date());
		//��ӹ���
		ArrayList<Object> noticeList = new ArrayList<Object>();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		//��ʾ����
		System.out.println("���������Ϊ��");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//ǿ�ƽ�����ķ���ת�������ࣿ��ǿ��ת����ôʹ�ã�
		}
		System.out.println("-----------");
		
		//�ڵ�һ������������һ���¹���
		ListDemo2Notice notice4 = new ListDemo2Notice(4, "���߱༭������ʹ������", "����Ա", new Date());
		noticeList.add(1, notice4);
		//��ʾ����
		System.out.println("��ӹ���������Ϊ��");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//ǿ�ƽ�����ķ���ת�������ࣿ��ǿ��ת����ôʹ�ã�
		}
		System.out.println("-----------");
		
		//ɾ����ʱ�����ҵ�Ĺ���
		noticeList.remove(2);
		//��ʾ����
		System.out.println("ɾ������������Ϊ��");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//ǿ�ƽ�����ķ���ת�������ࣿ��ǿ��ת����ôʹ�ã�
		}
		System.out.println("-----------");
		
		//���ڶ��������Ϊjava���߱༭������ʹ����!
		//�޸ĵڶ���������title��ֵ
		notice4.setTitle("java���߱༭������ʹ������");
		noticeList.set(1, notice4);
		//��ʾ����
		System.out.println("�޸Ĺ���������Ϊ��");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//ǿ�ƽ�����ķ���ת�������ࣿ��ǿ��ת����ôʹ�ã�
		}
		System.out.println("-----------");
	}

}
