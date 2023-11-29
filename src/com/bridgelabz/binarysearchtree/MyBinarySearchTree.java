package com.bridgelabz.binarysearchtree;

import java.util.ArrayList;

public class MyBinarySearchTree<T extends Comparable<T>>{
    private INode<T> root;
    public MyBinarySearchTree(){
        this.root = null;
    }
    public void addNode(T key){
        root = addNodeRecursively(root ,key);
    }
    private INode<T> addNodeRecursively(INode<T> root , T key){
        if(root == null){
            return new MyBinaryNode<>(key);
        }

        if(key.compareTo(root.getKey()) < 0){
            root.setLeft(addNodeRecursively(root.getLeft(),key));
        }
        else{
            root.setRight(addNodeRecursively(root.getRight(),key));
        }
        return root;
    }
    private void preOrderTraversalRecursive(INode<T> root , ArrayList<T> traversal){
        if(root == null){
            return;
        }
        traversal.add(root.getKey());
        preOrderTraversalRecursive(root.getLeft() , traversal);
        preOrderTraversalRecursive(root.getRight() , traversal);
    }
    public void printPreOrderTraversal(){
        ArrayList<T> traversal = new ArrayList<>();
        preOrderTraversalRecursive(root , traversal);
        System.out.println(traversal);
    }
}
