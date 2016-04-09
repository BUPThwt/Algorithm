package com.wg.offerAlgorithm;
/*
 * 翻转链表
 * 方法：1）递归
 * 2）循环发
 */
public class ReverseList {
  
	public static void printListNode(ListNode head){
		ListNode point =head;
		if(head==null){
			return;
		}
		while(point!=null){
			
			System.out.print(point.data+" ");
			point= point.next;
		}
		
	}
	/**
   * 利用递归翻转链表
   * @param head
   */
	public static void reverseList(ListNode head){
	  
		if(head!=null){
		 ListNode point=head.next;		
			if(point!=null){
		
				reverseList(head.next);
				point.next=head;
			}
			head.next=null;
			
		}
		
	
	}
	/**
	 * 循环翻转链表
	 * @param head
	 */
	public  static ListNode reverseList_(ListNode head){
		//需要定义三个节点，当前节点，前一个节点和后一个节点
		if(head==null){
			return null;
		}
		ListNode current=head;
		ListNode preNode=null;
		ListNode nextNode=null;
		while(current!=null){
			nextNode = current.next;
//			if(nextNode==null)
//				preNode=current;
		current.next=preNode;
		preNode=current;
		current=nextNode;
		}
		return preNode;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ListNode node1=new ListNode();
       node1.data=1;
       ListNode node2=new ListNode();
       node2.data=2;
       ListNode node3=new ListNode();
       node3.data=3;
       ListNode node4=new ListNode();
       node4.data=4;
       
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       node4.next=null;
       //遍历链表
 //      printListNode(node1);
       //链表翻转
      reverseList(node1);
       printListNode(node4);
  //     printListNode(reverseList_(node1));
       
	}

}
class ListNode{
	int data;
	ListNode next;
}
