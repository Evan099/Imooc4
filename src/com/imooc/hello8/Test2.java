package com.imooc.hello8;



//匿名内部类
//需求:根据传入的不同的人的类型，调用对应的read方法
//方案1和方案2已结省略，具体可看视频，下面直接通过匿名内部类来实现需求
public class Test2 {
	//定义一个getRead方法
	public void getRead(Person2 person2) {
		person2.read();
	}
	

	public static void main(String[] args) {

		Test2 test = new Test2();
		
//		匿名内部类的实现
		test.getRead(new Person2(){
			
			
			{//可以添加构造代码块
				System.out.println("我是构造代码块");
			}
			
			
		
			public void read() {
				System.out.println("男生喜欢读科幻类书籍");
			}
			
			
		});
	
		
		

	}

}
