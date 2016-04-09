package com.wg.offerAlgorithm;
/*
 * 求出数组中出现次数超过一半的数字
 * 思路：1、对数组进行排序，选出数组间位置的数肯定是次数超过一半的 数字 考虑排序的时间复杂度，
 *    2、 利用hashmap，对每一个数字出现的次数进行统计，最后找出次数大于n/2的数
 *    3、 设定第一个数为起始数，然后逐一进行比较，如果相等则count加1，如果count==0则更换起始数字，否则count--;复杂度O(n)
 */
public class MoreThanHalfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a={1,2,2,2,2,2,2,4,3,3,3,3,3,3,3,3,3,3,3,3,76};
     System.out.println(moreThanHalfNumber(a));
	}
	//第三种解法
   public static int moreThanHalfNumber(int[] number){
	   if(number==null||number.length<=0)
		   return 0;
	   int major =number[0];
	     int count=0;
	     for(int i=1;i<number.length;i++){
	    	 if(count==0){
	    		 major=number[i];
	    		 count++;
	    	 }else if(major==number[i]){
	    	      count++;	 
	    	 	}else{
	    	 		count--;
	    	 	}
	    	 }
	    	return major;
	     }
	     
  
   
   public static int majorityElement_1(int[] num){
		int major=num[0], count = 1;
       for(int i=1; i<num.length;i++){
           if(count==0){
               count++;
               major=num[i];
           }else if(major==num[i]){
               count++;
           }else count--;

       }
       return major;
  }
}
