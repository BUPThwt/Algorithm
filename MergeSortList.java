package com.wg.offerAlgorithm;
/*
 * 合并两个排序的链表
 * 思路：
 */
public class MergeSortList {

	public static void printListNode(List_Node head){
		List_Node point =head;
		if(head==null){
			return;
		}
		while(point!=null){
			
			System.out.print(point.data+" ");
			point= point.next;
		}
		
	}
	/**
	 * 
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static List_Node mergeSortList(List_Node head1,List_Node head2){
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		List_Node merge_head=null;
		//比较两个链表的头结点大小
		//如果链表1头结点小于链表2,将链表1 头结点作为合并链表的头结点，然后递归继续比较
		if(head1.data<head2.data){
			merge_head=head1;
			merge_head.next=mergeSortList(head1.next,head2);
		}
		else{
			merge_head=head2;
			merge_head.next=mergeSortList(head1,head2.next);
		}
		return merge_head;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //测试
		//链表1
		List_Node node1=new List_Node();
		List_Node node2=new List_Node();
		List_Node node3=new List_Node();
		List_Node node4=new List_Node();
		node1.data=1;
		node2.data=3;
		node3.data=5;
		node4.data=7;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=null;
		//链表2
		List_Node node5=new List_Node();
		List_Node node6=new List_Node();
		List_Node node7=new List_Node();
		List_Node node8=new List_Node();
		node5.data=2;
		node6.data=4;
		node7.data=6;
		node8.data=8;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=null;
		printListNode(mergeSortList(node1,node5));
	}

}
class List_Node{
	int data ;
	List_Node next;
}