package com.wg.offerAlgorithm;
/*
 * 归并排序
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort m= new MergeSort();
		int[] data ={ 5, 3, 6, 2, 1, 9, 4, 8, 7,44,2,5,3,5,3 }; 
	//	print(data);
	//	m.print(merge(data,0,4,8));
		m.mergeSort(data,0,data.length-1);
		m.print(data);
	}
	public static void print(int[] data){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
	
	public static void mergeSort(int[] data,int low ,int high){
		
		if(high>low){
			int mid=(high+low)/2;
			mergeSort(data,low,mid);
			mergeSort(data,mid+1,high);
			merge(data,low,mid,high);			
		}

	}
	/*
	 * 先利用分治思想对数组进行二路排序
	 */
	public static void merge(int[] a,int low,int mid,int high){
		//先定义临时数组
		int[] temp= new int[high-low+1];
		int i=low;
		int center=mid;
		int j=mid+1;
		int n=high;
		int k=0;
		//将a数组分为两部分，进行排序，存放在temp数组中
		while(i<=center && j<=high){
			if(a[i]<=a[j]){
				temp[k++]=a[i];
			     i++;
			}
			else {
				temp[k++]=a[j];
				j++;
			}				
		}
		while(i<=center){
			temp[k++]=a[i];
		     i++;
		}
		while(j<=n){
			temp[k++]=a[j];
			j++;
		}
		
		for(i=0;i<k;i++){
			a[low+i]=temp[i];
		}
	} 

}
