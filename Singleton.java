package com.wg.offerAlgorithm;
/*
 * /ʵ�ֵ���ģʽ �����̰߳�ȫ���ӳټ��ص����ŷ���
 * ���þ�̬�ڲ���ʵ��
 */

public class Singleton {

	//˽�л����캯��
	private Singleton(){};
	//��̬�ڲ���
	private static class  SingletonHolder{
		private static final Singleton instance = new Singleton();
	}
	//��ȡʵ������
	public static Singleton getInstance(){
		return SingletonHolder.instance;
	}
}
