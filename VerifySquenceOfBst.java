package com.wg.offerAlgorithm;

import java.util.Arrays;

/*
 * �ж������ǲ���ĳ������������
 */
public class VerifySquenceOfBst {
  
	public  boolean verifySquenceOfBst(int[]array,int length){
		//�߽�����
		if(array==null||length<=0)
			return false;
		int root=array[length-1];
		
		//�ҵ������������������ڵ�
		int cutPoint=0;
		for(int i=0;i<length-1;i++){
			if(array[i]>root){
				cutPoint=i;
				break;
			}
		}
		//�ж�������������ڽڵ�С�ڸ��ڵ㣬������鲻�Ƕ���������
		for(int j=cutPoint;j<length-1;j++){
			if(array[j]<=root)
				return false;
			
		}
	//	System.out.println(cutPoint);
		//�жϷָ��λ�ã����õݹ���в����
        boolean left=true;
		if(cutPoint>0)
			left = verifySquenceOfBst(Arrays.copyOfRange(array, 0, cutPoint),cutPoint);
		boolean right=true;
	   if(cutPoint<length-1)
			right =verifySquenceOfBst(Arrays.copyOfRange(array, cutPoint, length-1),length-1-cutPoint);
		
	  return left && right;
	  
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4};
		VerifySquenceOfBst test=new VerifySquenceOfBst();
		System.out.println(test.verifySquenceOfBst(array,4));

	}

}
