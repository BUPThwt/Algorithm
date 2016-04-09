package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * 在二叉树寻找符合条件的路径。
 */
public class PathInTree {
    
	public void findPath(BinaryTreeNode node,int key){
		if(node==null)
			return;
		Stack<Integer>path = new Stack<Integer>();
		findPath(node,key,path);
	}
	/**
	 * 
	 * @param root
	 * @param key
	 * @param path
	 */
	public void findPath(BinaryTreeNode root,int key,Stack<Integer>path){
		if(root==null)
			return;
	//	path.push(root.data);
		//如果当前节点没有叶子节点,则打印
		if(root.left==null && root.right==null){
			if(root.data==key){
				for(int i:path)
					System.out.print(i+" ");
				System.out.println(root.data);
			}
		}
		else{
			//现将当前节点亚栈，然后递归进行查找
			    path.push(root.data);
	
				findPath(root.left,key-root.data,path);
	
				findPath(root.right,key-root.data,path);
				path.pop();

		}
					
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root1=new BinaryTreeNode();
		BinaryTreeNode node1=new BinaryTreeNode();
		BinaryTreeNode node2=new BinaryTreeNode();
		BinaryTreeNode node3=new BinaryTreeNode();
		BinaryTreeNode node4=new BinaryTreeNode();
	
		root1.left=node1;
		root1.right=node2;
		node1.left=node3;
		node1.right=node4;
		
		root1.data=10;
		node1.data=5;
		node2.data=12;
		node3.data=4;
		node4.data=7;
	
		
		PathInTree testFindPath=new PathInTree();
		testFindPath.findPath(root1, 21);
	}

}
