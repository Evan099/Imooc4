package com.imooc.hello7;

public interface INet {
//	�ӿ��еĳ��󷽷����Բ�дabstract�ؼ��֣��������η�Ĭ��public
//  ����ʵ�ֽӿ�ʱ����Ҫȡʵ�ֽӿ��е����г��󷽷���������Ҫ����������Ϊ������	!!!
	 void network();
//	 void connection();
	 
//	�ӿ��п��԰���������Ĭ�� public fanal static
	 
	 int temp = 20;
	 
//	 default:Ĭ�Ϸ��������Դ�������  jdk1.8��
	 //������ʵ��������д��������ͨ���ӿڵ���
	 default void connection() {
		 System.out.println("����Ĭ�Ϸ���");
	 }
//	static:��̬���� ���Դ�������
	 //��������ʵ��������д������ͬ�ӿ�������
	 static void stop() {
		 System.out.println("���ǽӿ��еľ�̬����");
	 }
//	�ڽӿ��м���Ĭ�Ϸ������߾�̬������Ϳ�������������ӿڵ�ʵ�����п���ʵ�֣�1������ÿ����������д.��2�����ضԸ��ඨ�������abstract	 
//	 ���������ֻʹ�ýӿ��е�ĳЩ���𷽷�

	 
}
