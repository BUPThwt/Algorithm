package com.wg.offerAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��һ��ֻ����һ�ε��ַ�
 * ˼·������hashmap�洢ÿһ���ַ����ֵĴ�����Ȼ���ҳ�ֻ����һ�ε��ַ���
 */

public class FirstNotRepeatChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="abaccdeff";
     firstNotRepeatChar(str);
     
     
   }
   public static void firstNotRepeatChar(String str){
	   //�����ϣ��
	   Map<Character,Integer> map = new HashMap<Character,Integer>();
	   for(int i=0;i<str.length();i++){
		   if(map.containsKey(str.charAt(i))){
			   int count =map.get(str.charAt(i))+1;
			   map.put(str.charAt(i), count);
		   }else{
			   map.put(str.charAt(i), 1);
		   }
	   }
	   //����ֱ��ȡ������Ϊ1����
	   //���õ�����
	  Set<Entry<Character,Integer>>entrySet = map.entrySet();
	  for(Entry<Character,Integer> entry:entrySet){
	     if(entry.getValue()==1)
		  System.out.println(entry.getKey());
	  }
   }
}
