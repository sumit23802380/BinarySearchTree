package com.bridgelabz.binarysearchtree;

/*
    *@desc : Interface INode of generic type extends comparable having all related method to node of binary tree
 */
public interface INode <T extends Comparable<T>>{
    T getKey();
    INode<T> getLeft();
    INode<T> getRight();
    void setLeft(INode<T> left);
    void setRight(INode<T> right);
}
