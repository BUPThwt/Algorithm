package com.wg.offerAlgorithm;
/*
 * 输入数字n，按顺序打印出从1最大的n位十进制数
 * 思路：考虑大数，采用字符串表示
 */
public class PrintToMaxOfNDigits {

	
	public void printToMaxOfNDigits(int n){
		int[]array =new int[n];
		if(n<=0)
	     return;
		printArray(array,0);
		
	}
	public void printArray(int[]array,int n){
		if(n!=array.length){
			for(int i=0;i<10;i++){
				array[n]=i;				
				printArray(array,n+1);				
			}
		}
//		else{
//			boolean FirstNot0 = false;
//			for(int j=0;j<array.length;j++){
//				if(array[j]!=0){
//					
//				}
//			}
//		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintToMaxOfNDigits m=new PrintToMaxOfNDigits();
		m.printToMaxOfNDigits(2);
	}

}
