/*Ability to create the binary tree shown in the figure - Check if all are added with using size
method in Binary Tree*/

package com.bridgelab;

public class BSTNode {
    int value;
    BSTNode left, right;

    BSTNode(int value){
        this.value = value;
        left = null;
        right = null;
    }
}

class BinaryTreeDemo {
    //Method to Insert Node in Binary Tree
    public void insert(BSTNode node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new BSTNode(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "+ node.value);
                node.right = new BSTNode(value);
            }
        }
    }
    //Method to Traverse Tree Inorder
    public void traverseInOrder(BSTNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void main(String args[])
    {
        BinaryTreeDemo binaryTreeDemo = new BinaryTreeDemo();
        BSTNode root = new BSTNode(56);
        System.out.println("Binary Tree Example");
        System.out.println("Building binaryTreeDemo with root value " + root.value);
        binaryTreeDemo.insert(root, 30);
        binaryTreeDemo.insert(root, 70);
        binaryTreeDemo.insert(root,22);
        binaryTreeDemo.insert(root,40);
        binaryTreeDemo.insert(root,11);
        binaryTreeDemo.insert(root,16);
        binaryTreeDemo.insert(root,3);
        binaryTreeDemo.insert(root,60);
        binaryTreeDemo.insert(root,95);
        binaryTreeDemo.insert(root,65);
        binaryTreeDemo.insert(root,63);
        binaryTreeDemo.insert(root,67);

        System.out.println("Traversing binaryTreeDemo in order");
        binaryTreeDemo.traverseInOrder(root);


    }
}