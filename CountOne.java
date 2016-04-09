package com.wg.offerAlgorithm;
/*
 * google的面试题：找出1-n之间的数包含1的个数；
 * 1的个数=个位数1的个数+十位数1的个数+百位数1的个数……
 */
public class CountOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(countNumOf1(100));
	}
	 public static int countNumOf1(int n) {
	        if (n <= 0) {
	            return 0;
	        }
	        int count = 0;
	        int factor = 1;
	        int i=0;
	        while(n / factor != 0) {
	      
	        	int lowerNum = n - n / factor * factor;  //个位数
	            int currentNum = (n / factor) % 10;   //
	            int highNum = n / (factor * 10);
	            
	            if (currentNum == 0) {
	                // 如果为0,出现1的次数由高位决定
	                count += highNum * factor;
	            } else if (currentNum == 1) {
	                // 如果为1,出现1的次数由高位和低位决定
	                count += highNum * factor + lowerNum + 1;
	            } else {
	                // 如果大于1,出现1的次数由高位决定 
	                count += (highNum + 1) * factor;
	            }
	            factor *= 10;
	            i++;
	        }
	        return count;
	    }
}
