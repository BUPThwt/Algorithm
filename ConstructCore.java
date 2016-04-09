package com.wg.offerAlgorithm;

import java.util.Arrays;



public class ConstructCore {
	
	private class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}	
	public Node constructCore(int[]preOrder,int[]inOrder){
		if(preOrder==null||inOrder==null){
			return null;
		}
//		if(preOrder.length!=inOrder.length){
//		  	
//		}	
		Node root=null;
		for(int i=0;i<inOrder.length;i++){
			if(inOrder[i]==preOrder[0]){
				 root = new Node(inOrder[i]);
				//左右节点+
				root.left=constructCore(Arrays.copyOfRange(preOrder, 1, i+1),Arrays.copyOfRange(inOrder, 0, i));
				root.right=constructCore(Arrays.copyOfRange(preOrder, i+1, preOrder.length),Arrays.copyOfRange(inOrder,i+1,inOrder.length));
			}
		}
		return root;
	}
	
	 public void inOrder(Node node){  
	        if(node != null){  
	            inOrder(node.left);  
	            System.out.print(node.data+" ");  
	            inOrder(node.right);  
	        }  
	    } 
	 /** 
	     * 后序遍历 
	     * @param node 
	     */  
	    public void postOrder(Node node){  
	        if(node != null){  
	            postOrder(node.left);  
	            postOrder(node.right);  
	            System.out.print(node.data+" ");  
	        }  
	    }  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructCore test=new ConstructCore();
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		Node root=test.constructCore(pre,in);
	//	System.out.println(root.data);
		//test.postOrder(root);
	//	System.out.println(root.left.data);
	}

}
