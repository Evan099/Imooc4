package com.imooc.hello11;

import java.util.ArrayList;
import java.util.Date;

public class ListDemo2NoticeTest {

	public static void main(String[] args) {
		//创建notice类的对象，生成3条公告
		ListDemo2Notice notice1 = new ListDemo2Notice(1, "欢迎来到慕课网", "管理员", new Date());
		ListDemo2Notice notice2 = new ListDemo2Notice(2, "请同学们按时提交作业", "老师", new Date());
		ListDemo2Notice notice3 = new ListDemo2Notice(3, "考勤通知", "老师", new Date());
		//添加公告
		ArrayList<Object> noticeList = new ArrayList<Object>();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		//显示公告
		System.out.println("公告的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//强制将父类的方法转化到子类？？强制转换怎么使用？
		}
		System.out.println("-----------");
		
		//在第一条公告后面添加一条新公告
		ListDemo2Notice notice4 = new ListDemo2Notice(4, "在线编辑器可以使用啦！", "管理员", new Date());
		noticeList.add(1, notice4);
		//显示公告
		System.out.println("添加公告后的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//强制将父类的方法转化到子类？？强制转换怎么使用？
		}
		System.out.println("-----------");
		
		//删除按时完成作业的公告
		noticeList.remove(2);
		//显示公告
		System.out.println("删除公告后的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//强制将父类的方法转化到子类？？强制转换怎么使用？
		}
		System.out.println("-----------");
		
		//将第二条公告改为java在线编辑器可以使用啦!
		//修改第二条公告中title的值
		notice4.setTitle("java在线编辑器可以使用啦！");
		noticeList.set(1, notice4);
		//显示公告
		System.out.println("修改公告后的内容为：");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i+1+":"+((ListDemo2Notice)(noticeList.get(i))).getTitle());//强制将父类的方法转化到子类？？强制转换怎么使用？
		}
		System.out.println("-----------");
	}

}
