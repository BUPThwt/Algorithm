package com.wg.offerAlgorithm;
/*
 * ��ת�������С����
 */
public class MinNumberInRoateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ���ö��ֲ���˼��
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
		   //�м�����index1��index2��Ӧ�������ʱ��ֻ��˳�����
		  if(number[index1]==number[index2]&&number[midIndex]==number[index1]){
			  return minOrder(number,index1,index2);
		  }//����м�������index1����Ӧ����ʱ
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
    * ��index ��index2 midIndex��Ӧ�������ʱ����Ҫ����˳�����
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
