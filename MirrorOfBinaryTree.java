package com.wg.offerAlgorithm;
/*
 * ¶þ²æÊ÷¾µÏñ
 */
public class MirrorOfBinaryTree {
  
	public static void  invert(TreeNode root){
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			return;
		//½»»»
		TreeNode temp = root.left;
		root.left=root.right;
		root.right=temp;
		if(root.left!=null)
			invert(root.left);
		if(root.right!=null)
			invert(root.right);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
}