package com.wg.offerAlgorithm;
/**
 * �Թ�˾Ա���������������
 * ˼·��ͳ��ÿ��������ֵĴ�����Ȼ���������һ�ν���˳����
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
		//�����з�Ϊ�������趨��������ֵ
		int oldAge= 99;
		//�������飬����ͳ��ÿ��������ֵĴ���
		int[] timesOfAge= new int[oldAge+1];
		for(int i=0;i<=oldAge;i++){
			timesOfAge[i]=0;
		}
		//ͳ��ÿ��������ֵĴ���
		for(int i=0;i<length;i++){
			int age=ages[i];
			if(age<0 || age>oldAge){
				throw new Exception("���䳬��");
			}
			++timesOfAge[age];
		}
		//��0-99����һ�ν��б�����ȷ��ÿ������ĸ����������м����ʹ�ż���
		int index=0;
		for(int i=0;i<=oldAge;i++){
			for(int j=0;j<timesOfAge[i];j++){
				ages[index]=i;
				index++;
			}
		}
	}
	
	

}
