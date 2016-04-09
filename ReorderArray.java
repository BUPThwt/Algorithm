package com.wg.offerAlgorithm;
/*
 * 1：调整数组奇偶次序，但没有要求大小排序
 */
public class ReorderArray {

	
	public static void reorderArray(int[] array,int length){
		int p1=0;
		int p2=length-1;
		if(array==null||length==0){
			return;
		}
		while(p1<p2){
			while(array[p1]%2 ==0&& array[p2]%2!=0){
				int temp=array[p2];
				array[p2]=array[p1];
				array[p1]=temp;
			}
			while(array[p1]%2!=0){
				p1++;
			}
			while(array[p2]%2==0){
				p2--;
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array={1,2,3,4,5,6,7,8};
      reorderArray(array,8);
      for(int i=0;i<array.length;i++){
    	  System.out.print(array[i]+" ");
      }
	}

}
