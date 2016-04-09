package com.wg.offerAlgorithm;

import java.util.LinkedList;
import java.util.Stack;

/*
 * 
 * 2:用两个栈实现队列
 */
public class CQueue<T> {

	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	/**
	 * 入栈
	 * @param a
	 */
  public T appendTail(T a){
	  stack1.push(a);
	  return a;
  }
  /**
   * 出栈
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
		  throw new Exception("队列为空，不能删除");
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

