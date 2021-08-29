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

    public void size() {
        int outputSize = sizeRecursive(root);//3
        System.out.println("Size is " + outputSize);

    }

    private Integer sizeRecursive(MyBinaryNode<K> root) { //int
        Integer value;
        if (root == null) {
            value = 0;
        } else {
            value = sizeRecursive(root.left) + sizeRecursive(root.right) + 1;
        }
        return value;
    }


}