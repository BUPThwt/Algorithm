package com.wg.offerAlgorithm;

import java.util.LinkedList;

/*
 * ������������n ��m��������1��2��3.......n ������ȡ������, ʹ��͵���m  
 */
public class FindSum {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 10;  
        int n = 6;  
        findSum(sum,n);
	}
	
	 private static LinkedList<Integer> list = new LinkedList<Integer>();      
	     public  static void print(){
	    	  for (int i = 0; i < list.size(); i ++)  
	                 System.out.print("  "+ list.get(i));  
	             System.out.println();
	     }
	     
	     public static void findSum(int sum,int n){
	    	 if(n>=0&&sum==0){
	    		 print();
	    		 return;
	    	 }
	    	 if(n>=1&&sum==1){
	    		 list.push(1);
	    		 print();
	    		 list.pop();
	    		 return;
	    	 }
	    	 if(n==1&&sum>1){
	    		 return;
	    	 }
	    	 if(sum>=n){
	    		 list.push(n);
	    		 System.out.println("�ݹ������sum��"+sum+" "+"��n��"+n);
	    		 findSum(sum-n,n-1);
	    		
	    		 list.pop();
	    		 findSum(sum,n-1);
	    	 }else{
	    		 findSum(sum,sum);
	    	 }
	    	 return;
	     }
}
