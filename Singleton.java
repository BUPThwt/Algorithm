package com.wg.offerAlgorithm;
/*
 * /实现单例模式 满足线程安全和延迟加载的最优方案
 * 利用静态内部类实现
 */

public class Singleton {

	//私有化构造函数
	private Singleton(){};
	//静态内部咧
	private static class  SingletonHolder{
		private static final Singleton instance = new Singleton();
	}
	//获取实例方法
	public static Singleton getInstance(){
		return SingletonHolder.instance;
	}
}
