package com.imooc.hello6;
import com.imooc.hello6.Animal;
import com.imooc.hello6.Cat;
import com.imooc.hello6.Dog;

public class Test {

	public static void main(String[] args) {
		System.out.println("=========向上转型（不可以调用子类自己的方法）========");
		Animal one = new Animal();
		/*向上转型，隐式转型，自动转型
		 父类引用指向子类实例,可以调用子类重写父类的方法以及父类派生的方法，无法调用子类自己的方法，比如调用 “猫的跑动的方法就会报错！！”
		 父类中的静态方法无法在子类中重写，只能调用父类原有的静态方法
		 小类转型为大类
		 */
		Animal two = new Cat("小黑",2,3);
		Animal three = new Dog();
		one.eat();
		two.eat();
		three.eat();
		
		System.out.println("========向下转型（可以调用子类自己的方法）=========");
		/*向下转型，强制类型转换
		 * 子类引用指向父类对象，在此处必须进行强转，可以调用子类特有的方法
		 * 必须满足转换条件才能转换
		 */
		
		//System.out.println(two instanceof Cat);//判断   实例    左边是否是属于右边的  类
		
		Cat twos = (Cat)two;
		if(twos instanceof Cat) {
			twos.eat();
			twos.run();
			
			Dog threes = (Dog)three;
			
			threes.sleep();
		}
		
		
		

		

		

	}

}
