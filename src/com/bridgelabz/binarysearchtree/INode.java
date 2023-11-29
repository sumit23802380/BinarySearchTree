package com.bridgelabz.binarysearchtree;
/*
    *@desc : Interface INode of generic type extends comparable having all related method to node of binary tree
 */
public interface INode <T extends Comparable<T>>{
    /*
     * @desc : method to get the key of the node
     * @params :
     * @return : key of generic type
     */
    T getKey();
    /*
     * @desc : method to get the left node of the node
     * @params :
     * @return : INode of generic type
     */
    INode<T> getLeft();
    /*
     * @desc : method to get the right node of the node
     * @params :
     * @return : INode of generic type
     */
    INode<T> getRight();
    /*
     * @desc : method to set the left node of the node
     * @params : left INode
     * @return :
     */
    void setLeft(INode<T> left);
    /*
     * @desc : method to set the right node of the node
     * @params : right INode
     * @return :
     */
    void setRight(INode<T> right);
}
