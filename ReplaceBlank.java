package com.wg.offerAlgorithm;
/*
 * �滻�ո�
 * 
 */
public class ReplaceBlank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "we are happy  ";
      replaceBlank_(str);
   //   System.out.println(blankNum(str));
	}
	
	//�Ȼ���ַ����еĿո�ĸ�������һ��
	public static int getBlankNum(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			String temp = String.valueOf(str.charAt(i));
			if(temp.equals(" ")){
				count++;
			}
		}
		return count;
	}
	//��������ͳ�ƿո�����
	public static int blankNum(String str){
		int count=0;
		int index=-1;
		while((index=str.indexOf(" "))>=0){
			count++;
			str=str.substring(index+1);
		}
		return count;
		
	}
	//���ַ����еĿո�ת��Ϊ20%
	public static void replaceBlank(String str){
		if(str==null||str.length()<=0){
			return;
		}
		int blankNum = getBlankNum(str);
		int orginalLength=str.length();
		int newLength = orginalLength+2*blankNum;
		//�����µ����飬����Ϊ�ܳ�
		char[] tempArray = new char[newLength];
		//��ԭchar�ַ����鸴�Ƶ��´������ַ�������
		System.arraycopy(str.toCharArray(), 0, tempArray, 0, str.toCharArray().length);
		int p1=orginalLength-1;
		int p2=newLength-1;
		//���в����滻
		while(p1>=0 && p2>p1){
			if(tempArray[p1]==' '){
				tempArray[p2--]='0';
				tempArray[p2--]='2';
				tempArray[p2--]='%';
			}
			else{
				
				tempArray[p2--]=tempArray[p1];
			}
			p1--;
		}
		printArray(tempArray);
  }
	public static void replaceBlank_(String str){
		if(str==null||str.length()<=0){
			return;
		}
		int blankNum=getBlankNum(str);
		int orginalLength=str.length();
		int newLength =orginalLength+2*blankNum;
		//��strת�����ַ�����
		char[] chars=str.toCharArray();
		//�����µ��ַ�����
		char[] tempArray = new char[newLength];
		int p1=0;//ԭ����ָ��
		int p2=0;//������ָ��
		while(p1<orginalLength && p2<newLength){
			if(chars[p1]==' '){
				tempArray[p2++]='0';
				tempArray[p2++]='2';
				tempArray[p2++]='%';
			}
			else{
				tempArray[p2++]=chars[p1];
			}
			p1++;
		}
		printArray(tempArray);
	}
	//��ӡ�ַ�����
	public static void printArray(char[] testArray){
		for(char i:testArray){
			System.out.print(i);
		}
		
		System.out.println();
	} 

}
