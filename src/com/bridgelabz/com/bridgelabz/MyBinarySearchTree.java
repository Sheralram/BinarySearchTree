package com.bridgelabz.com.bridgelabz;


public class MyBinarySearchTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
        System.out.println(root);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }


}