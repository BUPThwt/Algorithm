package com.wg.offerAlgorithm;

import java.util.LinkedList;

public class StackImplementByTwoQueue<T> {

	private LinkedList<T> queue1;
	private LinkedList<T> queue2;
	public StackImplementByTwoQueue(){
		queue1 = new LinkedList<T>();
		queue2 =new LinkedList<T>();		
	}
	/**
	 * �������
	 * @param a
	 */
	public T push(T a){
		if(queue1.size()==0&&queue2.size()==0){
			queue1.addLast(a);
		}
		if(queue1.size()!=0){
			queue1.addLast(a);
		}else if(queue1.size()!=0){
			queue2.addLast(a);
		}
		return a;
	}
	/**
	 * ����	
	 * @return
	 */
	public T pop(){
		T a =null;
		if(queue1.size()==0&&queue2.size()==0){
			return null;	
		}
		//������2λ��ʱ��������һ��Ԫ�ط��ڶ���2��
		if(queue2.size()==0){
			while(queue1.size()>0){
				a =queue1.removeFirst();
				if(queue1.size()!=0){
					queue2.addLast(a);
				}
			}
		}else if(queue1.size()==0){
			while(queue2.size()>0){
				a =queue2.removeFirst();
				if(queue2.size()!=0){
					queue2.addLast(a);
				}
			}
		}
		return a;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StackImplementByTwoQueue stack = new StackImplementByTwoQueue();
      stack.push(3);
      stack.push(2);
  //    stack.queue1.push(7);
      int a =(int) stack.pop();
      System.out.println(a);  
   
	}

}
