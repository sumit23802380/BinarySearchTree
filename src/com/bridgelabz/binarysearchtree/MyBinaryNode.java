package com.bridgelabz.binarysearchtree;
/*
 * @desc : Class that implements Interface INode
 */
public class MyBinaryNode <T extends Comparable<T>> implements INode<T>{
    private T key;
    private INode<T> left;
    private INode<T> right;
    /*
     * @desc : Constructor to initialize the node with key
     */
    public MyBinaryNode(T key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
    /*
     * @desc : method to get the key of the node
     * @params :
     * @return : key of generic type
     */
    public T getKey(){
        return this.key;
    }
    /*
     * @desc : method to get the left node of the node
     * @params :
     * @return : INode of generic type
     */
    public INode<T> getLeft(){
        return this.left;
    }
    /*
     * @desc : method to get the right node of the node
     * @params :
     * @return : INode of generic type
     */
    public INode<T> getRight(){
        return this.right;
    }
    /*
     * @desc : method to set the left node of the node
     * @params : left INode
     * @return :
     */
    public void setLeft(INode<T> left){
        this.left = left;
    }
    /*
     * @desc : method to set the right node of the node
     * @params : right INode
     * @return :
     */
    public void setRight(INode<T> right){
        this.right = right;
    }
}
