package com.wg.offerAlgorithm;
/*
 * ��ת����
 * ������1���ݹ�
 * 2��ѭ����
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
   * ���õݹ鷭ת����
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
	 * ѭ����ת����
	 * @param head
	 */
	public  static ListNode reverseList_(ListNode head){
		//��Ҫ���������ڵ㣬��ǰ�ڵ㣬ǰһ���ڵ�ͺ�һ���ڵ�
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
       //��������
 //      printListNode(node1);
       //����ת
      reverseList(node1);
       printListNode(node4);
  //     printListNode(reverseList_(node1));
       
	}

}
class ListNode{
	int data;
	ListNode next;
}
