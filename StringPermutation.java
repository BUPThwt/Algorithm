package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * 打印字符串中字符的所有排列
 */
public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String str="abc";
//	//  permutation(str);
	  combination(str);
		
		
	}
	public static void permutation(String str){
		if(str==null)
			return;
		char[] c=str.toCharArray();
		permutation_(c,0);
	}
	//打印字符串中字符的所有排列
	public static void permutation(char[] c,int begin){
		if(begin==c.length-1){
			System.out.println(String.valueOf(c));
		}
		else{
			//交换
			for(int i=begin;i<c.length;i++){
				char temp=c[begin];
				c[begin]=c[i];
				c[i]=temp;
				permutation(c,begin+1);
				//将交换后的数组还原
				temp=c[begin];
				c[begin]=c[i];
				c[i]=temp;
			}
		}
	}
	//判断当前字符是否在之前的c[0]-c[end]中出现过
	public static boolean isExist(int start,int end,char[] c){
		for(int i=start;i<end;i++){
			if(c[end]==c[i]){
				return true;
			}
		}
		return false;
	}
	//加入去重复
	public static void permutation_(char[] c,int begin){
		if(begin==c.length-1){
			System.out.println(String.valueOf(c));
		}
		else{
			//交换
			for(int i=begin;i<c.length;i++){
				
				if(!isExist(begin,i,c)){										
					char temp=c[begin];
					c[begin]=c[i];
					c[i]=temp;
					permutation_(c,begin+1);
					//将交换后的数组还原
					temp=c[begin];
					c[begin]=c[i];
					c[i]=temp;
				}
			}
		}
	}
	//打印字符串中字符的所有组合(没有考虑重复)
	public static void combination(String str){
		char[] c=str.toCharArray();
		if(c.length==0) return;
		Stack<Character>stack = new Stack<Character>();
		for(int i=1;i<=c.length;i++){
			combination(c,0,i,stack);
		}
	}
	public static void combination(char[] chars,int begin, int number,Stack<Character>stack){
		//当begin+number大于数组长度时 不满足条件 不要在向stack中添加删除
		if(number>1 && (begin+number)>chars.length) return;
		if(number==0){
			System.out.println(stack.toString());
		    return;  //从当前方法中退出，返回到该调用方法的语句处，继续执行。
		}
	   if(begin==chars.length)
	    {
		   return;
		   }
	   System.out.println(begin+" "+number);
	   stack.push(chars[begin]);
	   combination(chars,begin+1,number-1,stack);
	   stack.pop();
	   combination(chars,begin+1,number,stack);
	}
	 

}
