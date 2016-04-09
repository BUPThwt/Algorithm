package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * 输入两颗二叉树A和B,判断B是不是A的子结构，
 */
public class BinaryTree {
    private BinaryTreeNode root;
	public  void buildTree(BinaryTreeNode node,int data){
		//首先判断节点是否为空
	//   BinaryTreeNode root=node;
	   if(root==null){
		   root = new BinaryTreeNode();
		   root.data=data;
	   }
	   else{
		   //建立左子树
		   if(node.data>data){
			   if(node.left==null){
				   node.left=new BinaryTreeNode();
				   node.left.data=data;
			   }else{
				   buildTree(node.left,data);
			   }
		   }else{
			   if(node.right==null){
				   node.right=new BinaryTreeNode();
				   node.right.data =data;
			   }else{
				   buildTree(node.right,data);
			   }
		   }
	   }
			  
	
	}
	/**
	 * 前序遍历非递归
	 * @param node
	 */
	public static void preOrder(BinaryTreeNode node){
		Stack<BinaryTreeNode> stack =new Stack<BinaryTreeNode>();
		if(node!=null){
			stack.push(node);
			while(!stack.isEmpty()){
				node=stack.pop();
				System.out.println(node.data);
				if(node.right!=null){
					stack.push(node.right);
				}
				if(node.left!=null){
					stack.push(node.left);
				}
			}
		}
	}
	/**
	 * 递归方法
	 * @param node
	 */
	public static void preOrder_(BinaryTreeNode node){
		if(node==null)
			return;
		if(node!=null){
			System.out.println(node.data);
			preOrder_(node.left);
			preOrder_(node.right);
		}
	}
	/**
	 * 非递归中序遍历
	 * @param node
	 */
	public static void inOrder(BinaryTreeNode node){
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		while(node!=null||stack.size()>0){
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
			if(stack.size()>0){
				node=stack.pop();
				System.out.print(node.data+"" );
				node=node.right;
			}
		}
	}
	
	public static void inOrder_(BinaryTreeNode node){
		if(node!=null){
			inOrder_(node.left);
			System.out.print(node.data);
			inOrder_(node.right);
		}
	}
	/**
	 * 非递归后续遍历
	 * @param node
	 */
	public static void postOrder(BinaryTreeNode node){
		Stack<BinaryTreeNode>stack = new Stack<BinaryTreeNode>();
		//定义节点preNode 用于记录上一次出栈的节点
		BinaryTreeNode preNode=null;
		while(node!=null||stack.size()>0){
			//将所有的左子树压栈
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
			if(stack.size()>0){
				//临时节点，用于记录当前出栈的节点的右节点
				BinaryTreeNode temp=stack.peek().right;
				//进行判断右节点是否存在或者右节点是否等于上一次出栈的节点，如果为空或者等于说明没有要出栈的右节点，接下来可以出栈下一个节点
				if(temp==null||temp==preNode){
					node=stack.pop();
					System.out.print(node.data+" ");
					preNode=node;
					node=null;
				}//判断不成立，则将该节点入栈
				else{
					node=temp;
				}
			}
		}
	}
	/**
	 * 递归后续遍历
	 * @param node
	 */
	public static void postOrder_(BinaryTreeNode node){
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data);
		}
	}
	
	public BinaryTreeNode searchTree(BinaryTreeNode node,int key){
		BinaryTreeNode current = node;
		if(current==null)
		return null;
		else{
			if(current.data==key){
				return current;
			}
			else if(current.data >key){
				current=searchTree(current.left,key);
			}else if(current.data<key){
				current=searchTree(current.right,key);
			}
//			else{
//				current=null;
//			}
		}
			
		return current;
		
	}
	public void insert(int key){
		//创建一个新的节点
		BinaryTreeNode newNode = new BinaryTreeNode();
		if(root==null){
			root=newNode;
			root.data=key;
		}else{
			BinaryTreeNode current=root;
			BinaryTreeNode parent;
			while(true){
				parent=current;
				if(current.data>key){
					current=current.left;
					if(current==null){
						parent=newNode;
						parent.data=key;
					}
				}else{
					current=current.right;
					if(current==null){
						parent=newNode;
						parent.data=key;
					}
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={12,76,35,22,16,48,90,46,9,40};
		BinaryTree bTree = new BinaryTree();
		   for (int i = 0; i < a.length; i++) {  
	            bTree.buildTree(bTree.root, a[i]);  	
	        }  
		//   bTree.preOrder(bTree.root);
		  System.out.print( bTree.searchTree(bTree.root, 2));
	}

}
class BinaryTreeNode{
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
}