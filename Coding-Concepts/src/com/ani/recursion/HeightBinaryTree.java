package com.ani.recursion;

class Node {
  int n;
  Node left;
  Node right;
  
  public Node (int n, Node left, Node right) {
    this.n = n;
    this.left = left;
    this.right = right;
  }
  
}

public class HeightBinaryTree {
  
  static int treeHeight(Node root) {
    if (root == null)
        return 0;
    return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
  }
  
  
  public static void main(String[] args) {
    
    // Creating a binary tree
    Node leaf1 = new Node(10, null, null);
    Node leaf2 = new Node(7, null, null);
    Node leaf3 = new Node(6, null, null);
    Node leaf4 = new Node(16, null, null);
    
    Node child1 = new Node(12, leaf1, leaf2);
    Node child2 = new Node(40, leaf3, leaf4);
    
    Node root = new Node(100, child1, child2);
    
    System.out.println("Height of the Tree is : " + treeHeight(root));
  }
  
}
