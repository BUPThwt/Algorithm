package com.wg.offerAlgorithm;
/*
 * ���������¡
 */
public class ComplexListNodeClone {
   //�������������ֲ�ʵ��
	//���ȸ��Ƹ�������
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
	//����ÿ���ڵ��sibling
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
   //����������ͷ���
	public static ComplexListNode reConnectNode(ComplexListNode head){
		//ɾ�����������ӵ�
		ComplexListNode point =head.next;
		while(point.next!=null){
			point.next=point.next.next;
			point = point.next;
		}
		return head.next;
	}
	
	//�����������
	public ComplexListNode clone(ComplexListNode head){
		cloneNode(head);
		connectSiblingNode(head);
		 return reConnectNode(head);
	}
}
//���帴������
class  ComplexListNode{
	int data;
	ComplexListNode next;
	ComplexListNode sibling;
}
