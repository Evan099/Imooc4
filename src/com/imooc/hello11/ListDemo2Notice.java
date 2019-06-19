package com.imooc.hello11;

import java.util.Date;

//公告类
public class ListDemo2Notice {
	private int id;//id
	private String title;//标题
	private String creator;//创建人
	private Date createTime;//创建时间
	
	//创建构造方法
	public ListDemo2Notice(int id, String title, String creator, Date createTime) {
		super();
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.createTime = createTime;
	}
	//封装
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
}
