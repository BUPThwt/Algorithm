package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * ��ӡ�ַ������ַ�����������
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
	//��ӡ�ַ������ַ�����������
	public static void permutation(char[] c,int begin){
		if(begin==c.length-1){
			System.out.println(String.valueOf(c));
		}
		else{
			//����
			for(int i=begin;i<c.length;i++){
				char temp=c[begin];
				c[begin]=c[i];
				c[i]=temp;
				permutation(c,begin+1);
				//������������黹ԭ
				temp=c[begin];
				c[begin]=c[i];
				c[i]=temp;
			}
		}
	}
	//�жϵ�ǰ�ַ��Ƿ���֮ǰ��c[0]-c[end]�г��ֹ�
	public static boolean isExist(int start,int end,char[] c){
		for(int i=start;i<end;i++){
			if(c[end]==c[i]){
				return true;
			}
		}
		return false;
	}
	//����ȥ�ظ�
	public static void permutation_(char[] c,int begin){
		if(begin==c.length-1){
			System.out.println(String.valueOf(c));
		}
		else{
			//����
			for(int i=begin;i<c.length;i++){
				
				if(!isExist(begin,i,c)){										
					char temp=c[begin];
					c[begin]=c[i];
					c[i]=temp;
					permutation_(c,begin+1);
					//������������黹ԭ
					temp=c[begin];
					c[begin]=c[i];
					c[i]=temp;
				}
			}
		}
	}
	//��ӡ�ַ������ַ����������(û�п����ظ�)
	public static void combination(String str){
		char[] c=str.toCharArray();
		if(c.length==0) return;
		Stack<Character>stack = new Stack<Character>();
		for(int i=1;i<=c.length;i++){
			combination(c,0,i,stack);
		}
	}
	public static void combination(char[] chars,int begin, int number,Stack<Character>stack){
		//��begin+number�������鳤��ʱ ���������� ��Ҫ����stack�����ɾ��
		if(number>1 && (begin+number)>chars.length) return;
		if(number==0){
			System.out.println(stack.toString());
		    return;  //�ӵ�ǰ�������˳������ص��õ��÷�������䴦������ִ�С�
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
