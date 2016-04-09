package com.wg.offerAlgorithm;
/*
 * 求从小到大第k个丑数
 */

public class GetUglyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  public static int getUglyNumber(int n){
	  if(n<=0) return 0;
	  int[] uglyNum = new int[n];
	  uglyNum[0]=1;
	  int multiply2=0;
	  int multiply3=0;
	  int multiply5=0;
	  for(int i=1;i<n;i++){
		  int min=Min(uglyNum[multiply2]*2,uglyNum[multiply3]*2,uglyNum[multiply5]*2);
		  uglyNum[i]=min;
		  while(uglyNum[multiply2]*2<=min){
			  multiply2++;
		  }
		  while(uglyNum[multiply3]*2<=min){
			  multiply3++;
		  }
		  while(uglyNum[multiply5]*2<=min){
			  multiply5++;
		  }
	  }
	  return uglyNum[n-1];
	  
  }
	//比较三个数得到最小的
	public static int Min(int number1,int number2,int number3){
		int min=(number1<number2)?number1:number2;
		return min<number3?min:number3;
	}
 
}
