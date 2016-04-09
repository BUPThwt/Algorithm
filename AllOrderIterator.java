package com.wg.offerAlgorithm;
/*
 * È«ÅÅÁĞµİ¹éËã·¨
 */

public class AllOrderIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a={1,2,3};
      range(a,0);
	}
	public static void range(int[] a,int start){
		if(start==a.length){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]);
			}			
			System.out.println();
		}
		for(int i=start;i<a.length;i++){
			int temp=a[start];
			a[start]=a[i];
			a[i]=temp;
			range(a,start+1);
			a[i]=a[start];
			a[start]=temp;
		}
	}

}
