package com.wg.offerAlgorithm;
/*
 * 连续字数组的最大和。
 * 思路：1、
 *     2、采用动态规划
 */
public class FindGreatestSumOfSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array={1,-2,3,10,-4,7,2,-5};
     System.out.println(findGreastSumOfSubArray(array,8));
	}
	
	public  static  int findGreastSumOfSubArray(int[]array,int length){
		if(array==null||length<0)
			return 0;
		int nCurSum=0;//表示当前数
		int nGreatestSum=0;
		for(int i=0;i<length;++i){
			if(nCurSum<=0){
				nCurSum = array[i];
			}else{
				nCurSum+=array[i];
			}
			if(nCurSum>nGreatestSum){
				nGreatestSum =nCurSum;
			}			
		}
		return nGreatestSum;
	}

}
