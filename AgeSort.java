package com.wg.offerAlgorithm;
/**
 * 对公司员工的年龄进行排序
 * 思路：统计每个年龄出现的次数，然后根据年龄一次进行顺序存放
 * @author wgcris
 *
 */
public class AgeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] ages={4,3,23,2,3,4,56,23,1,4,5,100};
     try {
		ageSort(ages,11);
		for(int i=0;i<ages.length;i++){
			System.out.print(ages[i]+" ");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void ageSort(int[] ages,int length) throws Exception{
		if(ages==null||length<=0){
			return ;
		}
		//年龄有分为，这里设定年龄的最大值
		int oldAge= 99;
		//创建数组，用于统计每个年龄出现的次数
		int[] timesOfAge= new int[oldAge+1];
		for(int i=0;i<=oldAge;i++){
			timesOfAge[i]=0;
		}
		//统计每个年龄出现的次数
		for(int i=0;i<length;i++){
			int age=ages[i];
			if(age<0 || age>oldAge){
				throw new Exception("年龄超限");
			}
			++timesOfAge[age];
		}
		//从0-99年龄一次进行遍历，确定每个年龄的个数，年龄有几个就存放几次
		int index=0;
		for(int i=0;i<=oldAge;i++){
			for(int j=0;j<timesOfAge[i];j++){
				ages[index]=i;
				index++;
			}
		}
	}
	
	

}
