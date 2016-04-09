package com.wg.offerAlgorithm;
/*
 * 将两个有序数组合并为一个升序数组
 */
public class OrderArraySort {

	public int[] getArraySort(int[]m,int[] n){
		int im=0;
		int jn=0;
		int[] mn =new int[m.length+n.length];
	    while(im<m.length && jn<n.length){
	    	if(m[im]<=n[jn]){
	    		mn[im+jn]=m[im];
	    		im++;
	    	}else{
	    		mn[im+jn]=n[jn];
	    		jn++;
	    	}
	    }
	    while(im < m.length){  
            mn[im + jn] = m[im];  
            im++;  
        }  
        while(jn < n.length){  
            mn[im + jn] = n[jn];  
            jn++;  
        }  
		return mn;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] m = {1,3,5,7,9,11,12,13};  
	        int[] n = {2,3,6,8,10};  
	        OrderArraySort oas = new OrderArraySort();  
	        int[] mn = oas.getArraySort(m, n);  
	        for(int i=0;i<mn.length;i++){  
	            System.out.print(mn[i]+" ");  
	        }  
	}
  
}
