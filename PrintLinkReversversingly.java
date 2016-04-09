package com.wg.offerAlgorithm;
/*
 * �������ӡ
 */

public class PrintLinkReversversingly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkNode node1=new LinkNode(1);
      LinkNode node2 =new LinkNode(2);
      LinkNode node3 = new LinkNode(3);
      node1.setNext(node2);
      node2.setNext(node3);
      System.out.println("����תǮ��");
      //��ӡ����
      LinkNode h = node1;
      while(h!=null){
    	  System.out.print(h.getData()+" ");
    	  h=h.getNext();
      }

      //����ת
//      LinkNode.reverse(node1);
//   //   node1.setNext(null);
//      System.out.println("��ת��");
//   // ��ӡ����
//    while(node3!=null){
//  	  System.out.print(node3.getData()+" ");
//  	  node3=node3.getNext();
//    }
      node1=LinkNode.reverse1(node1);
      while(node1!=null){
    	  System.out.print(node1.getData()+" ");
    	  node1=node1.getNext();
      }
	}

}

//���ȶ�������ṹ
class LinkNode{
	private int data;
	private LinkNode next;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}
	
	//���캯��
	public LinkNode(int data){
		this.data = data;
	}
	
	//�ݹ�ʵ������ת
	public static void reverse(LinkNode head){
		if(head!=null){
			LinkNode nextNode = head.getNext();
			if(nextNode!=null){
				reverse(head.getNext());
			    nextNode.setNext(head);
			}
		  head.setNext(null);
		}
	}
	//ѭ������
	public static LinkNode reverse1(LinkNode head){
		if(head==null){
			return head;			
		}
		LinkNode pre = head;
		LinkNode cur =head.getNext();
		LinkNode next;
		while(cur!=null){
			next = cur.getNext();
			cur.setNext(pre);
			pre = cur;
			cur=next;
		}
		head.setNext(null);
		head=pre;
		return head;
	}
	
}
