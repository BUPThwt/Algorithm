package com.wg.offerAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("输入两行数字……");
//         
//      int N= scanner.nextInt();
//      int P= scanner.nextInt();
//      int W=scanner.nextInt();
//      int H=scanner.nextInt();
//      System.out.println("输入每段字符数");
//  //  int line1=scanner.nextInt();
//      
//      int[] a=new int[N];
//      for(int k=0;k<N;k++){
//    	  a[k]=scanner.nextInt();
//      }
//      int result=0;
//      for(int i=0;i<N;i++){
//    	  result+=a[i];
//      }
//      result=W*H*P/result;
//      int size = (int) Math.sqrt(result);
//      System.out.println(size);
       
		Scanner in =new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		
		do{
			int a=in.nextInt();
			list.add(a);
			int b=in.nextInt();
			list.add(b);
			
		}while(in.nextLine().equals(""));
	

			
		for(int i=0;i<list.size();i=i+2){
			System.out.println(list.get(i)+list.get(i+1));
		}
		
	
		
		
	}
	
	
}
