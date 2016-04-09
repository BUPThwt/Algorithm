package com.wg.offerAlgorithm;
/*
 * 内部类和外部类同名
 */

public class Test {
   private int x;
   private  class Inner{
	   private int x=9;
	   public void doit(int x){
		   x++;
		   this.x++;
		   Test.this.x++;
		   System.out.println("内部类的变量x"+this.x);
		   System.out.println("外部类的变量x"+Test.Inner.this.x);
		   System.out.println("形参x"+x);
	   }
   }
   public void test(){
	   System.out.println("调用外部类x:"+x);
	   System.out.println("调用内部咧的x"+new Test.Inner().x);
   }
	public static void main(String[] args){
		Test ts =new Test();
		Inner in= ts.new Inner();
	//	in.doit(3);
		System.out.println("在外部类输出的函数");
		System.out.println(ts.x);
		System.out.println(in.x);
		in.doit(3);
		System.out.println(ts.x);
		System.out.println(in.x);
		
	}

}
