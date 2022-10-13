/*Ability to create a BST by adding 56 and then
adding 30 & 70 - Use INode to create My Binary Node - Note the key has to extend comparable to
compare and determine left or right node - First add 56 as root node so 30 will be
added to left and 70 to right*/

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
        System.out.println("Traversing binaryTreeDemo in order");
        binaryTreeDemo.traverseInOrder(root);

    }
}