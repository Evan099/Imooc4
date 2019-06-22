package com.imooc.hello12;

public class ArrayDemo {
	
	public static void main(String[] args) {
		//定义形式1，推荐使用此种
//		int[] intArray = new int[4];
//		int[] intArrays = {1,6,9,4};
		
		//定义形式2
		//定义好数组后需要初始化数组
		
		int intArray[] = new int[4];
		int intArrays[] = {1,6,9,4};
		System.out.println(intArray.length);
		for (int i = 0; i < intArrays.length; i++) {
			System.out.print(intArrays[i]);
		}
		
		
	}

}
