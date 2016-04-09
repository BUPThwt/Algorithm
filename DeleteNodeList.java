package com.wg.offerAlgorithm;
/**
 * 删除连表节点在O(1)时间内
 * @author wgcris
 *
 */
public class DeleteNodeList {

	class Node{
		int data;
		Node next;
	}
	/**
	 * 删除节点
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
			//是否是尾节点，如果是尾节点就得从头开始遍历
			if(deNode.next==null){
				Node point = head;
				while(point.next!=null){
					point=point.next;
				}
				point.next=null;
		   }
			else{
				//复制节点，将删除节点下一个节点数据赋给删除节点，将删除节点
				deNode.data=deNode.next.data;
				deNode.next=deNode.next.next;
			}
			
		
		}
			
		}
	}


