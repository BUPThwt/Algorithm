package com.wg.offerAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 第一个只出现一次的字符
 * 思路：利用hashmap存储每一个字符出现的次数，然后找出只出现一次的字符、
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
	   //定义哈希表
	   Map<Character,Integer> map = new HashMap<Character,Integer>();
	   for(int i=0;i<str.length();i++){
		   if(map.containsKey(str.charAt(i))){
			   int count =map.get(str.charAt(i))+1;
			   map.put(str.charAt(i), count);
		   }else{
			   map.put(str.charAt(i), 1);
		   }
	   }
	   //可以直接取出次数为1的数
	   //利用迭代器
	  Set<Entry<Character,Integer>>entrySet = map.entrySet();
	  for(Entry<Character,Integer> entry:entrySet){
	     if(entry.getValue()==1)
		  System.out.println(entry.getKey());
	  }
   }
}
