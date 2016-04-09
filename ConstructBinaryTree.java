package com.wg.offerAlgorithm;

import java.util.Stack;

/*
 * �ؽ�������
 * �������Ĵ���������
 * 
 */
public class ConstructBinaryTree {
   private Node root;
   
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
	public ConstructBinaryTree(){
		root=null;
	}
	//�ݹ鹹����
	public void buildTree(Node node,int data){
		if( root==null){
			root=new Node(data);
		}else{
		   if(data<node.data){
			   if(node.left==null){
				   node.left=new Node(data);
			   }else{
				   buildTree(node.left,data);
				  
			   }
		   }if(data>node.data){
			   if(node.right==null){
				   node.right=new Node(data);
			   }else{
				   buildTree(node.right,data);
			   }
		   }	
		}
	}
	
	 /** 
     * ǰ����� 
     * @param node 
     */  
    public void preOrder(Node node){  
        if(node != null){  
            System.out.print(node.data+" ");  
            preOrder(node.left);  
            preOrder(node.right);  
        }  
    } 
    /**
     * �ǵݹ������ǰ�����
     * ����ջʵ��
     * @param node
     */
    public void preOrder_(Node node){
    	Stack<Node> stack = new Stack<Node>();
    	if(node!=null){
    		stack.push(node);
    		while(!stack.empty()){
    			node=stack.pop();
    			System.out.print(node.data+" ");
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
     * ������� 
     * @param node 
     */  
    public void inOrder(Node node){  
        if(node != null){  
            inOrder(node.left);  
            System.out.print(node.data+" ");  
            inOrder(node.right);  
        }  
    } 
    /**
     * ����ǵݹ����
     * @param node
     */
      public void inOrder_(Node node){
    	  Stack<Node> stack = new Stack<Node>();
    	  while(node!=null ||stack.size()>0){
    		  while(node!=null){
    			  stack.push(node);
    			  node=node.left;
    		  }
    		  if(stack.size()>0){
    			  node=stack.pop();
    			  System.out.print(node.data+" ");
    			  node = node.right;
    		  }
    	  }
      }
      
      public void in_Order(Node node){
    	  Stack<Node> stack = new Stack<Node>();
  		while(node!=null||stack.size()>0){	
  				while(node!=null){
  				//��Ԫ��ѹջ
  		  			stack.push(node);
  					node=node.left;
  				}
  				 if(stack.size()>0){
  					//��ջ
  					node=stack.pop();
  				  System.out.println(node.data);	
  				  node=node.right;
  				}
  			
  			
  		}
      }
    /** 
     * ������� 
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
     * �����ǵݹ����
     * @param node
     */
    public void postOrder_(Node node){
    	Stack<Node> stack = new Stack<Node>();
    	Node prve=node;
    	while(node!=null||stack.size()>0){
    		while(node!=null){
    			stack.push(node);
    			node = node.left;
    		}
    		if(stack.size()>0){
    			Node temp = stack.peek().right;
    			if(temp==null||temp==prve){
    				node = stack.pop();
    				System.out.print(node.data+" ");
    				prve =node;
    				node=null;
    			}else{
    				node = temp;
    			}
    		}
    	}
    }
    /**
     * ����������ڵ�
     * @param data
     */
    public  void  insert(int data){
    	Node newNode = new Node(data);
    
    	if(root==null){
    		root = newNode;
    	}
    	else{
    		Node current=root;
    		Node parent;
    		while(true){
    			parent=current;
    			//������
    			if(current.data>data){
    				current=current.left;
    				if(current==null){
    					parent.left=newNode;
    					return;
    				}
    			}
    			else{
    				current =current.right;
    				if(current==null){
    					parent.right=newNode;
    					return;
    				}
    			}
    				System.out.println(parent.data);
    		}
    	
    	}
    	
    }
    /**
     * ������Сֵ
     * @param root
     * @return
     */
    public Node minimum(Node root){
    	Node last=null;
    	Node current= root;
    	while(current!=null){
    		last=current;
    		current = current.left;
    	}
    	return last;
    }
    /**
     * �������ֵ
     * @param root
     * @return
     */
    public Node maxmum(Node root){
    	Node last=null;
    	Node current=root;
    	while(current!=null){
    		last=current;
    		current=current.right;
    	}
    	return last;
    }
    /**
     * ɾ���ڵ�
     * @param node
     */
    public void deleteNode(Node node){
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] a = {2,4,12,45,21,6,111}; 
		int[] a={12,76,35,22,16,48,90,46,9,40};
		ConstructBinaryTree bTree = new ConstructBinaryTree();  
        for (int i = 0; i < a.length; i++) {  
            bTree.buildTree(bTree.root, a[i]);  
        }  
//        bTree.insert(20);
//        Node last=bTree.minimum(bTree.root);
//        System.out.println(last.data);
//        bTree.preOrder_(bTree.root);  
//        System.out.println();
         
        bTree.in_Order(bTree.root);  
        System.out.println();
//        bTree.inOrder(bTree.root);  
//        System.out.println();
//        bTree.postOrder_(bTree.root); 
	}
}
//
