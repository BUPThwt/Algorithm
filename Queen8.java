package com.wg.offerAlgorithm;
/*
 * �˻ʺ�����
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
    * ����һ�����飬ColumnIndex[8]�����е�i�������ʾλ�ڵ�i�лʺ���кš�
    * �Ը��������ȫ�ţ�Ȼ���ж�ÿһ���ж�Ӧ��8���ʺ��ǲ�����ͬһ�Խ��ߣ�
    */
	public static void print(int[] a ){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void permutation(int[] a,int begin){
	//	 int num=0; //ͳ�Ʒ�������
        
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
	
	//�ж������������Ƿ����Ϊ1����-1
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
