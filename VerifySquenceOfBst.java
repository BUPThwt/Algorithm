package com.wg.offerAlgorithm;

import java.util.Arrays;

/*
 * 判断数组是不是某个二叉搜索树
 */
public class VerifySquenceOfBst {
  
	public  boolean verifySquenceOfBst(int[]array,int length){
		//边界条件
		if(array==null||length<=0)
			return false;
		int root=array[length-1];
		
		//找到二叉搜索树左子树节点
		int cutPoint=0;
		for(int i=0;i<length-1;i++){
			if(array[i]>root){
				cutPoint=i;
				break;
			}
		}
		//判断右子树如果存在节点小于根节点，则该数组不是二叉树后续
		for(int j=cutPoint;j<length-1;j++){
			if(array[j]<=root)
				return false;
			
		}
	//	System.out.println(cutPoint);
		//判断分割点位置，利用递归进行差最后啊
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
