package com.wg.offerAlgorithm;
/*
 * ͳ�ƶ���������1�ĸ���
 * 
 */
public class NumberOfInBinary {
    public static int numberOf1(int n){
    	int count=0;
    	while(n!=0){
    		++count;
    		n=(n-1)&n;
    	}
    	return count;
    }
    
    public static void main(String[] args){
    	System.out.println(numberOf1(9));
    }
}
