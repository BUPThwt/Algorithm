package com.wg.offerAlgorithm;
/*
 * 找到最小的k个数。
 * 思路：1、对数组进行排序，然后输出最小的k个数,主要考虑排序的时间复杂度，快排O(nlogn);
 * 	2、利用快速排序找中间元素的思路，基于数组第k个元素进行调整，使得比k个元素大的在k元素的右边，
 *    比k元素小的在左边，这样在k元素左边的就是要求得最小k个元素。
 *  3、利用二叉树容器，先想容器中存入k个数，然后每次从输入的n个整数中读入一个数，
 *    如果容器中未满，则直接加入到容器中，如果满了，则找出容器中存入的最大数和当前读入的数进行比较，和替换，逐次进行，直至结束。
 */
public class GetLeastNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void getLeastNumber(int[] array,int n,int k){
		int start=0;
		int end= n-1;
		int index =partition(array,n,start,end);
		while(index!=k-1){
			if(index>k-1){
				end=index-1;
				index=partition(array,n,start,end);
			}else{
				start=index+1;
				index=partition(array,n,start,end);
				}
		}
		for(int i=0;i<k;i++){
			System.out.print(array[i]+"");
		}
	}
	//求中间元素位置
   public static int partition(int[] num,int length,int low,int high){
	   if(num==null||num.length<0) 
		   return 0;
	   int p1=low;
	   int p2=high-1;
	   int point=num[low];
	   while(p1<p2){
		   while(p1<p2 && num[p2]>=point){
			   p2--;
		   }
		   num[p1]=num[p2];
		   while(p1<p2 && num[p1]<point){
			   p1++;
		   }
		   num[p1]=num[p2];
	  
	   }
	   num[p1]=point;
	   return p1;
	   
   }
}
