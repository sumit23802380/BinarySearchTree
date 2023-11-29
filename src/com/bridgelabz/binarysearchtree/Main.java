package com.bridgelabz.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> binarySearchTree = new MyBinarySearchTree<>();
        binarySearchTree.addNode(56);
        binarySearchTree.addNode(30);
        binarySearchTree.addNode(40);
        binarySearchTree.addNode(22);
        binarySearchTree.addNode(11);
        binarySearchTree.addNode(3);
        binarySearchTree.addNode(16);
        binarySearchTree.addNode(70);
        binarySearchTree.addNode(60);
        binarySearchTree.addNode(95);
        binarySearchTree.addNode(65);
        binarySearchTree.addNode(63);
        binarySearchTree.addNode(67);
        binarySearchTree.printPreOrderTraversal();
        System.out.println("Size of BST is : " + binarySearchTree.size());
    }
}