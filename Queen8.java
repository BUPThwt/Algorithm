package com.wg.offerAlgorithm;
/*
 * 八皇后问题
 */
public class Queen8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a={1,2,3,4,5,6,7,8}; 
    
		
 //     System.out.println(isEqual(a));
      permutation(a,0);
	}                      
   /*
    * 定义一个数组，ColumnIndex[8]数组中第i个数组表示位于第i行皇后的列号。
    * 对该数组进行全排，然后判断每一排列对应的8个皇后是不是在同一对角线，
    */
	public static void print(int[] a ){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void permutation(int[] a,int begin){
	//	 int num=0; //统计方案总数
        
		 if(begin==a.length-1){
			if(!isEqual(a)){
			print(a);
			}
			return;
		}
		else{
			for(int i=begin;i<a.length;i++){
				int temp=a[begin];
				a[begin]=a[i];
				a[i]=temp;
				//digui
				permutation(a,begin+1);
				temp=a[begin];
				a[begin]=a[i];
				a[i]=temp;
			}
		}
	}
	
	//判断相邻两个数是否相差为1或者-1
	public static boolean isEqual(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			  int j=i+1;
			  if((i-j==a[i]-a[j])||(j-i==a[i]-a[j])){
				  return true;
			  }
		}
		return false;
	}
	
}
