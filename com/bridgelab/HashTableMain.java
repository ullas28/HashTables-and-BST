/*Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but
because they keep putting themselves deliberately into paranoid avoidable situations”
- Use LinkedList to do the Hash Table Operation like here the removal of word avoidable
- To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode*/

package com.bridgelab;

import java.util.Scanner;

public class HashTableMain {
    public static void main(String[] args) {
        //HashTableExp Object for Generic Type
        MyMapNode<String> myMapNode = new MyMapNode<>();

        Scanner sc = new Scanner(System.in);

        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String strArr[] = str.split(" ");

        System.out.println("Given String ="+str);
        //Passing Array Element in HashTable Index
        for(String mystr : strArr) {
            //Get index of each object
            int index = myMapNode.myHashFunction(mystr);
            //Store Element in Hash Table at given index
            myMapNode.storeKey(index,mystr);
        }

        //Methode to Show Hash Table Data
        myMapNode.showHashList();

        //Code to Remove the Given Word from HashTable Linked List
        System.out.println("\nEnter the Word to Remove from Hash Table :");
        String word = sc.next();
        int index = myMapNode.myHashFunction(word);
        myMapNode.removeKey(index,word);

        myMapNode.showHashList();
    }
}
