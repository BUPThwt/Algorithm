package com.wg.offerAlgorithm;
/*
 * ��������n����˳���ӡ����1����nλʮ������
 * ˼·�����Ǵ����������ַ�����ʾ
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
