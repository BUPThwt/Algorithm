
package com.wg.offerAlgorithm;
/*
 * 把数组排成最下的数
 * 思路：1、对数组元素进行全排列，然后比较得到最小。复杂度高
 * 2、将数转换成字符串，字符串大小，逐次进行。复杂度O(n)
 */
public class PrintMinNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //测试
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
	
	//得到两个数字拼接的最小值
	public static String getMinNum(String a,String b){
		String result=null;
		//a+b字符串
		String left = String.valueOf(a)+String.valueOf(b);
		//b+a字符串
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
