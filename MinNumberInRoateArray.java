package com.wg.offerAlgorithm;
/*
 * 旋转数组的最小数字
 */
public class MinNumberInRoateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 利用二分查找思想
	 * @param arr
	 * @param length
	 * @return
	 */
   public static  int min(int[] number,int length){
	   int index1=0;
	   int index2=length-1;
	   int midIndex=index1;
	   while(number[index1]>=number[index2]){
		   if(index1-index2==1){
			   midIndex=index2;
			   break;
			
		   }
		   
		   midIndex =index1+(index2-index1)>>1;
		   //中间数和index1和index2对应的数相等时，只能顺序查找
		  if(number[index1]==number[index2]&&number[midIndex]==number[index1]){
			  return minOrder(number,index1,index2);
		  }//如果中间数大于index1所对应的数时
		  else if(number[midIndex]>=number[index1]){
			   index1=midIndex;
		   }
		   else if(number[midIndex]<=number[index2]){
			   index2=midIndex;
		   }
	   }
	   return number[midIndex];
   }
   /**
    * 当index 和index2 midIndex对应的数相等时，需要进行顺序查找
    * @param number
    * @param index1
    * @param index2
    * @return
    */
   public static int minOrder(int[] number,int index1,int index2){
	int result=number[index1];
	for(int i=index1+1;i<index2;i++){
		if(number[i]<result){
			result=number[i];
		}
	}
	return result;
   }
}
