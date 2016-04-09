
package com.wg.offerAlgorithm;
/*
 * �������ų����µ���
 * ˼·��1��������Ԫ�ؽ���ȫ���У�Ȼ��Ƚϵõ���С�����Ӷȸ�
 * 2������ת�����ַ������ַ�����С����ν��С����Ӷ�O(n)
 */
public class PrintMinNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //����
//		int a=1;
//		int b=32;
//		System.out.println(getMinNum(String.valueOf(a),String.valueOf(b)));
		int[] array={3,32,321};
		System.out.println(printMinNum(array));
	}
	
	public static int printMinNum(int[] array){
		
		String curNum=String.valueOf(array[0]);
		String result=null;
		for(int i=1;i<array.length;i++){
		
			result =getMinNum(curNum,String.valueOf(array[i]));
			curNum=result;
		}
		return Integer.parseInt(result);
	}
	
	//�õ���������ƴ�ӵ���Сֵ
	public static String getMinNum(String a,String b){
		String result=null;
		//a+b�ַ���
		String left = String.valueOf(a)+String.valueOf(b);
		//b+a�ַ���
		String right = String.valueOf(b)+String.valueOf(a);
		for(int i=0;i<left.length();i++){
			if(left.charAt(i)<right.charAt(i)){
		
				result=left;
				break;
			}else if(left.charAt(i)>right.charAt(i)){
			
				result=right;
				break;
			}
		}
		return result;
	}

}
