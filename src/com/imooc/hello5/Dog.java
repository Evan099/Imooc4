package com.imooc.hello5;

public class Dog extends Animal{
	private String sex;//�Ա�
	//����޲ι��췽��
	public Dog() {
		
	}
	//����вι��췽��
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//���˯���ķ���
	public void sleep() {
		System.out.println(this.getName()+"����"+this.getMonth()+"���´�����˯��");
	}
	
	//��д
<<<<<<< HEAD
	@Override
	public void eat() {
		System.out.println(this.getName()+"��͵��(��д��)");
		
	}
	
	
	//������д�˸��෽�����޷����ʸ���ķ��������ǿ��Ե��ø���ķ���
	public static void main(String[] args) {

		Animal xx = new Animal();//���Ե��ø��෽���������ܷ��ʸ��෽���������Ҫ������Ҫ��super
		xx.setName("xx");
		xx.eat();
		
		Dog bb = new Dog();//������д����ķ���
		bb.setName("bb");
		bb.eat();


=======
	public void eat() {
		System.out.println(this.getName()+"��͵��");
		
	}
	
	
	//������д�˸��෽�����޷����ʸ���ķ��������ǿ��Ե��ø���ķ���
	public static void main(String[] args) {
		Animal xx = new Animal();//���ø��෽��
		xx.setName("xx");
		xx.eat();
		
		Dog bb = new Dog();//������д����ķ���
		bb.setName("bb");
		bb.eat();
				
>>>>>>> branch 'master' of https://github.com/Evan099/Imooc4.git
		
		
	}
	
	

}
