package com.gopika.binaryTree;

import java.util.*;

public class LowestCommonAncestor {
	
	static List<Integer> path1 = new ArrayList<Integer>();
	static List<Integer> path2 = new ArrayList<Integer>();

	public static void main(String[] args) {

		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		
		root.left.left = new BinaryTree(4);
		root.left.right = new BinaryTree(5);
		
		System.out.println("4&5 :"+findLCA(root,4,5));
		System.out.println("2&3 :"+findLCA(root,2,3));
		System.out.println("4&3 :"+findLCA(root,4,3));
		System.out.println("9&3 :"+findLCA(root,9,3));


	}
	
	
	
	public static boolean findPath(BinaryTree node,int n,List<Integer> path) {
		
		if(node == null) {
			return false;
		}
		
		path.add(node.data);
		
		if(node.data == n) {
			return true;
		}
		
		if(node.left!=null && findPath(node.left,n,path)) {
			return true;
		}
		
		if(node.right!=null && findPath(node.right,n,path)) {
			return true;
		}
		
		path.remove(path.size()-1);
		return false;
	}
	
	
	public static int findLCA(BinaryTree root,int n1, int n2) {
		
		path1.clear();
		path2.clear();
		
		return findInternalLCA(root,n1,n2);		
		
	}
	
	public static int findInternalLCA(BinaryTree root,int n1, int n2) {
		
		if(!findPath(root,n1,path1)||!findPath(root,n2,path2)) {
			return -1;
		}
		
		int i;
		
		for(i=0;i<path1.size()&& i<path2.size();i++) {
			if(path1.get(i)!=path2.get(i)) {
				break;
			}
		}
		
		return path1.get(i-1);
	}

}
