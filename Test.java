package com.wg.offerAlgorithm;
/*
 * �ڲ�����ⲿ��ͬ��
 */

public class Test {
   private int x;
   private  class Inner{
	   private int x=9;
	   public void doit(int x){
		   x++;
		   this.x++;
		   Test.this.x++;
		   System.out.println("�ڲ���ı���x"+this.x);
		   System.out.println("�ⲿ��ı���x"+Test.Inner.this.x);
		   System.out.println("�β�x"+x);
	   }
   }
   public void test(){
	   System.out.println("�����ⲿ��x:"+x);
	   System.out.println("�����ڲ��ֵ�x"+new Test.Inner().x);
   }
	public static void main(String[] args){
		Test ts =new Test();
		Inner in= ts.new Inner();
	//	in.doit(3);
		System.out.println("���ⲿ������ĺ���");
		System.out.println(ts.x);
		System.out.println(in.x);
		in.doit(3);
		System.out.println(ts.x);
		System.out.println(in.x);
		
	}

}
