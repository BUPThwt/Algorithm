package com.wg.offerAlgorithm;
/*
 * 替换空格
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
	
	//先获得字符串中的空格的个数方法一：
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
	//方法二：统计空格数量
	public static int blankNum(String str){
		int count=0;
		int index=-1;
		while((index=str.indexOf(" "))>=0){
			count++;
			str=str.substring(index+1);
		}
		return count;
		
	}
	//将字符串中的空格转换为20%
	public static void replaceBlank(String str){
		if(str==null||str.length()<=0){
			return;
		}
		int blankNum = getBlankNum(str);
		int orginalLength=str.length();
		int newLength = orginalLength+2*blankNum;
		//创建新的数组，长度为总长
		char[] tempArray = new char[newLength];
		//将原char字符数组复制到新创建的字符数组内
		System.arraycopy(str.toCharArray(), 0, tempArray, 0, str.toCharArray().length);
		int p1=orginalLength-1;
		int p2=newLength-1;
		//进行查找替换
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
		//将str转换成字符数组
		char[] chars=str.toCharArray();
		//创建新的字符数组
		char[] tempArray = new char[newLength];
		int p1=0;//原数组指针
		int p2=0;//新数组指针
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
	//打印字符数组
	public static void printArray(char[] testArray){
		for(char i:testArray){
			System.out.print(i);
		}
		
		System.out.println();
	} 

}
