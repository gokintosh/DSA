package com.gokul.BinaryTree;


import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        TreeNode left;
        TreeNode right;

        int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinarytree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root=first;
        root.left=second;
        root.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
    }

    public void preOrderRecursiveTraversal(TreeNode root){
        if(root==null){
            return;
        }

        System.out.println("The data is "+root.data);
        preOrderRecursiveTraversal(root.left);
        preOrderRecursiveTraversal(root.right);
    }
    public void preOrderIterativeTraversal(TreeNode root){

        if(root==null){
            return;
        }
        Stack<TreeNode>treeNodeStack=new Stack<>();
        treeNodeStack.push(root);
        while (!treeNodeStack.empty()){
            TreeNode temp=treeNodeStack.pop();
            System.out.println("the data is"+temp.data);
            if(temp.right!=null){
                treeNodeStack.push(temp.right);
            }
            if(temp.left!=null){
                treeNodeStack.push(temp.left);
            }
        }
    }


    public static void main(String[] args) {

        BinaryTree tree1=new BinaryTree();
        tree1.createBinarytree();
        tree1.preOrderRecursiveTraversal(tree1.root);

    }
}
