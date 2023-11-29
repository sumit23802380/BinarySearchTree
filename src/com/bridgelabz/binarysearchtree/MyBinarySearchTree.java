package com.bridgelabz.binarysearchtree;
import java.util.ArrayList;
/*
 * @desc : Class of binary search tree of generics extends comparable
 */
public class MyBinarySearchTree<T extends Comparable<T>>{
    private INode<T> root;
    /*
     * @desc : Constructor to initialize the root with null
     */
    public MyBinarySearchTree(){
        this.root = null;
    }
    /*
     * @desc : add the node to bst calls the method add node recursively
     * @params : key of generics
     * @return :
     */
    public void addNode(T key){
        root = addNodeRecursively(root ,key);
    }
    /*
     * @desc : adds the node recursively by comparing the key value of the root
     * @params : root of the bst , key of generics
     * @return : root
     */
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
    /*
     * @desc : preorder traversal recursive method
     * @params : root of bst and arraylist for storing the traversal
     * @return :
     */
    private void preOrderTraversalRecursive(INode<T> root , ArrayList<T> traversal){
        if(root == null){
            return;
        }
        traversal.add(root.getKey());
        preOrderTraversalRecursive(root.getLeft() , traversal);
        preOrderTraversalRecursive(root.getRight() , traversal);
    }
    /*
     * @desc : prints the preorder traversal
     * @params :
     * @return :
     */
    public void printPreOrderTraversal(){
        ArrayList<T> traversal = new ArrayList<>();
        preOrderTraversalRecursive(root , traversal);
        System.out.println(traversal);
    }
}
