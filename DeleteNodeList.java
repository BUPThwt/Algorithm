package com.wg.offerAlgorithm;
/**
 * ɾ������ڵ���O(1)ʱ����
 * @author wgcris
 *
 */
public class DeleteNodeList {

	class Node{
		int data;
		Node next;
	}
	/**
	 * ɾ���ڵ�
	 * @param head
	 * @param deNode
	 */
	public void deleteNode(Node head,Node deNode){
		if(deNode==null ||head==null){
			return ;
		}
		if(head==deNode){
			head=null;
		}
		
		else{
			//�Ƿ���β�ڵ㣬�����β�ڵ�͵ô�ͷ��ʼ����
			if(deNode.next==null){
				Node point = head;
				while(point.next!=null){
					point=point.next;
				}
				point.next=null;
		   }
			else{
				//���ƽڵ㣬��ɾ���ڵ���һ���ڵ����ݸ���ɾ���ڵ㣬��ɾ���ڵ�
				deNode.data=deNode.next.data;
				deNode.next=deNode.next.next;
			}
			
		
		}
			
		}
	}


