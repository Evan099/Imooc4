package com.imooc.hello3;

//import com.imooc.hello2.*;//调用hello2里面的所有类
import com.imooc.hello2.Boy;//调用hello2里面的Boy类
//import com.imooc.*;//注意！！！！   这种直接引用是不行的，只能加载类名上的父级*  !!!
public class Test {

	public static void main(String[] args) {
		Boy one = new Boy();
		one.setName("张三");
		System.out.println(one.getName());
		
		
		
		
	}

}
