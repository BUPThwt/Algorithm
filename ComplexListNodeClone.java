package com.wg.offerAlgorithm;
/*
 * 复杂链表克隆
 */
public class ComplexListNodeClone {
   //采用三个函数分步实现
	//首先复制复杂链表
	public static void cloneNode(ComplexListNode head){
		ComplexListNode cur =head;
		while(cur!=null){
			ComplexListNode node =new ComplexListNode();
			node.data=cur.data;
			node.next=cur.next;
			node.sibling=null;
			cur.next=node;
			cur=node.next;
		}
	}
	//设置每个节点的sibling
	public static void connectSiblingNode(ComplexListNode head){
		ComplexListNode point = head;
		while(point!=null){
			ComplexListNode cloned =point.next;
			if(cloned.sibling!=null){
				cloned.sibling=point.sibling.next;
			}
			point =cloned.next;
		}
	}
   //拆开链表，返回头结点
	public static ComplexListNode reConnectNode(ComplexListNode head){
		//删除奇数的连接点
		ComplexListNode point =head.next;
		while(point.next!=null){
			point.next=point.next.next;
			point = point.next;
		}
		return head.next;
	}
	
	//组合三个函数
	public ComplexListNode clone(ComplexListNode head){
		cloneNode(head);
		connectSiblingNode(head);
		 return reConnectNode(head);
	}
}
//定义复杂链表
class  ComplexListNode{
	int data;
	ComplexListNode next;
	ComplexListNode sibling;
}
