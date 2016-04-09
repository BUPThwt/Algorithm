package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * 输入一个链表，输出链表倒数第k 个结点
 * 方法：1）利用栈
 * 2)利用双指针
 */
public class FindKthToTail {

	/**
	 * 利用栈实现输出倒数第k个结点
	 * @param head
	 * @param k
	 * @return
	 */
	public static Node findKthToTail(Node head,int k){
		Stack<Node> stack = new Stack<Node>();
		//将链表节点亚栈
		if(head==null||k==0)
			return null;
		Node point =head;
		while(point!=null){
			stack.push(point);
			point = point.next;
		}
		//出栈 
		Node kthNode=null;
		int count=0;
		while(!stack.isEmpty()){
			
			kthNode=stack.pop();
			count++;
			if(count==k){
			//	kthNode=stack.pop();
				break;
			}			
		}
		return kthNode;		
	}
	public static Node findKthToTail_(Node head,int k){
		//考虑边界条件
		if(head==null||k<=0){
			return null;
		}
		//定义两个指针
		Node node1=head;
		Node nodeResult=null;
		//第一个节点先走k-1步
		for(int i=0;i<k-1;i++){
			if(node1.next!=null)
			node1=node1.next;
		}
		nodeResult =head;
		//第一个指针节点继续遍历，第二个指针节点开始从头结点遍历
		while(node1.next!=null){
			node1=node1.next;
			nodeResult=nodeResult.next;
		}
		return nodeResult;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node node1= new Node();
      node1.data=1;
      Node node2= new Node();
      node2.data=2;
      Node node3= new Node();
      node3.data=3;
      Node node4= new Node();
      node4.data=4;
      node1.next=node2;
      node2.next=node3;
      node3.next=node4;
      node4.next=null;
    
      System.out.println((findKthToTail(node1,4)).data);
	}

}
class Node{
	int data;
	Node next;
}