package com.imooc.hello6;
import com.imooc.hello6.Animal;
import com.imooc.hello6.Cat;
import com.imooc.hello6.Dog;

public class Test {

	public static void main(String[] args) {
		System.out.println("=========����ת�ͣ������Ե��������Լ��ķ�����========");
		Animal one = new Animal();
		/*����ת�ͣ���ʽת�ͣ��Զ�ת��
		 ��������ָ������ʵ��,���Ե���������д����ķ����Լ����������ķ������޷����������Լ��ķ������������ ��è���ܶ��ķ����ͻᱨ������
		 �����еľ�̬�����޷�����������д��ֻ�ܵ��ø���ԭ�еľ�̬����
		 С��ת��Ϊ����
		 */
		Animal two = new Cat("С��",2,3);
		Animal three = new Dog();
		one.eat();
		two.eat();
		three.eat();
		
		System.out.println("========����ת�ͣ����Ե��������Լ��ķ�����=========");
		/*����ת�ͣ�ǿ������ת��
		 * ��������ָ��������ڴ˴��������ǿת�����Ե����������еķ���
		 * ��������ת����������ת��
		 */
		
		//System.out.println(two instanceof Cat);//�ж�   ʵ��    ����Ƿ��������ұߵ�  ��
		
		Cat twos = (Cat)two;
		if(twos instanceof Cat) {
			twos.eat();
			twos.run();
			
			Dog threes = (Dog)three;
			
			threes.sleep();
		}
		
		
		

		

		

	}

}
