package com.gopika.binaryTree;

import java.util.*;

public class TreeImpl {

	public static void main(String[] args) {
		
		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		
		root.left.left = new BinaryTree(4);
		root.left.right = new BinaryTree(5);
		
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);
		
		
		//Breadth first traversal using queue method
		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTree b = q.poll();
			System.out.println(b.data);
			
			if(b.left!=null) {
				q.add(b.left);
			}
			
		    if(b.right!=null) {
		    	q.add(b.right);
		    }
		}
		
		System.out.println("height of the tree "+ height(root));
		
		
		//breadth first traversal using recursive method
		
		int h = height(root);
		for(int i =1;i<=h;i++) {
			printGivenLevel(root,i);
		}
		
		

	}
	
	public static int height(BinaryTree node) {
		
		if(node == null) {
			return 0;
		}else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			
			if(lheight>rheight) {
				return (lheight+1);
			}else {
				return (rheight+1);
			}
		}
		
	}
	
	public static void printGivenLevel(BinaryTree node,int level) {
		
		if(node == null) {
			return;
		}
		
		if(level == 1) {
			System.out.println(node.data);
		}else if(level > 1) {
			printGivenLevel(node.left,level-1);
			printGivenLevel(node.right,level-1);
		}
		
	}

}
