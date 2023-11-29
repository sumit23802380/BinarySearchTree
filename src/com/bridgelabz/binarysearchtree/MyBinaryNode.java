package com.bridgelabz.binarysearchtree;
public class MyBinaryNode <T extends Comparable<T>> implements INode<T>{
    private T key;
    private INode<T> left;
    private INode<T> right;
    public MyBinaryNode(T key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
    public T getKey(){
        return this.key;
    }
    public INode<T> getLeft(){
        return this.left;
    }
    public INode<T> getRight(){
        return this.right;
    }
    public void setLeft(INode<T> left){
        this.left = left;
    }
    public void setRight(INode<T> right){
        this.right = right;
    }
}
