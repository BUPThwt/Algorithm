package com.wg.offerAlgorithm;
/*
 * �ҵ���С��k������
 * ˼·��1���������������Ȼ�������С��k����,��Ҫ���������ʱ�临�Ӷȣ�����O(nlogn);
 * 	2�����ÿ����������м�Ԫ�ص�˼·�����������k��Ԫ�ؽ��е�����ʹ�ñ�k��Ԫ�ش����kԪ�ص��ұߣ�
 *    ��kԪ��С������ߣ�������kԪ����ߵľ���Ҫ�����Сk��Ԫ�ء�
 *  3�����ö��������������������д���k������Ȼ��ÿ�δ������n�������ж���һ������
 *    ���������δ������ֱ�Ӽ��뵽�����У�������ˣ����ҳ������д����������͵�ǰ����������бȽϣ����滻����ν��У�ֱ��������
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
	//���м�Ԫ��λ��
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
