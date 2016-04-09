package com.wg.offerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 从上到下打印二叉树
 * 
 * 思路：利用队列性质
 */
public class PrintFromTopToBottom {

	public void printFromTopToBottom(BinaryTreeNode node){
		//采用队列方式
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		if(node!=null){
			return;
		}
	
		queue.add(node);
		while(!queue.isEmpty()){
			BinaryTreeNode temp=queue.poll();
			System.out.print(temp.data);
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
