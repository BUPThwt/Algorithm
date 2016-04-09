package com.wg.offerAlgorithm;
/*
 * ��������г��ִ�������һ�������
 * ˼·��1���������������ѡ�������λ�õ����϶��Ǵ�������һ��� ���� ���������ʱ�临�Ӷȣ�
 *    2�� ����hashmap����ÿһ�����ֳ��ֵĴ�������ͳ�ƣ�����ҳ���������n/2����
 *    3�� �趨��һ����Ϊ��ʼ����Ȼ����һ���бȽϣ���������count��1�����count==0�������ʼ���֣�����count--;���Ӷ�O(n)
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
	//�����ֽⷨ
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
