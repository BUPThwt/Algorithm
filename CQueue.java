package com.wg.offerAlgorithm;

import java.util.LinkedList;
import java.util.Stack;

/*
 * 
 * 2:������ջʵ�ֶ���
 */
public class CQueue<T> {

	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	/**
	 * ��ջ
	 * @param a
	 */
  public T appendTail(T a){
	  stack1.push(a);
	  return a;
  }
  /**
   * ��ջ
   * @return
   * @throws Exception
   */
  public T deleteHead() throws Exception{
	  if(stack2.isEmpty()){
		  while(!stack1.isEmpty()){
			  stack2.push(stack1.pop());
		  }
	  }
	  if(stack2.isEmpty()){
		  throw new Exception("����Ϊ�գ�����ɾ��");
	  }
	  return stack2.pop();
  }
  
  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

