package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * ����һ�����������������k �����
 * ������1������ջ
 * 2)����˫ָ��
 */
public class FindKthToTail {

	/**
	 * ����ջʵ�����������k�����
	 * @param head
	 * @param k
	 * @return
	 */
	public static Node findKthToTail(Node head,int k){
		Stack<Node> stack = new Stack<Node>();
		//������ڵ���ջ
		if(head==null||k==0)
			return null;
		Node point =head;
		while(point!=null){
			stack.push(point);
			point = point.next;
		}
		//��ջ 
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
		//���Ǳ߽�����
		if(head==null||k<=0){
			return null;
		}
		//��������ָ��
		Node node1=head;
		Node nodeResult=null;
		//��һ���ڵ�����k-1��
		for(int i=0;i<k-1;i++){
			if(node1.next!=null)
			node1=node1.next;
		}
		nodeResult =head;
		//��һ��ָ��ڵ�����������ڶ���ָ��ڵ㿪ʼ��ͷ������
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