package com.bridgelabz.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> binarySearchTree = new MyBinarySearchTree<>();
        binarySearchTree.addNode(50);
        binarySearchTree.addNode(30);
        binarySearchTree.addNode(70);
        binarySearchTree.addNode(20);
        binarySearchTree.addNode(40);
        binarySearchTree.printPreOrderTraversal();
    }
}
