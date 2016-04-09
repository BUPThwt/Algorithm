package com.wg.offerAlgorithm;
/*
 * 判断树B是树B的子结构
 * 
 */

public class SubStructureInTree {

	public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root2==null)
			return true;
		else if(root1==null)
			return false;
		boolean result=false;
		if(root1!=null&&root2!=null){
			if(root1.data==root2.data){
				result=doesTree1HaveTree2(root1,root2);
			}
			if(!result){
				return hasSubTree(root1.left,root2)||hasSubTree(root1.right,root2);
			}
		}
		return result;
	}
	/**
	 * 判断子树是否一样
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean doesTree1HaveTree2(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root2==null){
			return true;
		}else if(root1==null){
			return false;
		}
		if(root1.data!=root2.data){
			return false;
		}else{
			return doesTree1HaveTree2(root1.left,root2.left)&&doesTree1HaveTree2(root1.right,root2.right);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  
}
