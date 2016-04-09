package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * �������Ŷ�����A��B,�ж�B�ǲ���A���ӽṹ��
 */
public class BinaryTree {
    private BinaryTreeNode root;
	public  void buildTree(BinaryTreeNode node,int data){
		//�����жϽڵ��Ƿ�Ϊ��
	//   BinaryTreeNode root=node;
	   if(root==null){
		   root = new BinaryTreeNode();
		   root.data=data;
	   }
	   else{
		   //����������
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
	 * ǰ������ǵݹ�
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
	 * �ݹ鷽��
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
	 * �ǵݹ��������
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
	 * �ǵݹ��������
	 * @param node
	 */
	public static void postOrder(BinaryTreeNode node){
		Stack<BinaryTreeNode>stack = new Stack<BinaryTreeNode>();
		//����ڵ�preNode ���ڼ�¼��һ�γ�ջ�Ľڵ�
		BinaryTreeNode preNode=null;
		while(node!=null||stack.size()>0){
			//�����е�������ѹջ
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
			if(stack.size()>0){
				//��ʱ�ڵ㣬���ڼ�¼��ǰ��ջ�Ľڵ���ҽڵ�
				BinaryTreeNode temp=stack.peek().right;
				//�����ж��ҽڵ��Ƿ���ڻ����ҽڵ��Ƿ������һ�γ�ջ�Ľڵ㣬���Ϊ�ջ��ߵ���˵��û��Ҫ��ջ���ҽڵ㣬���������Գ�ջ��һ���ڵ�
				if(temp==null||temp==preNode){
					node=stack.pop();
					System.out.print(node.data+" ");
					preNode=node;
					node=null;
				}//�жϲ��������򽫸ýڵ���ջ
				else{
					node=temp;
				}
			}
		}
	}
	/**
	 * �ݹ��������
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
		//����һ���µĽڵ�
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