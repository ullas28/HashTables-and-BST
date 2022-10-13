/*Ability to find frequency of words in a sentence like ““Paranoids are not paranoid because they are paranoid
 butbecause they keep putting themselves deliberately into paranoid avoidable situations””
- Use LinkedList to do the Hash Table Operation
- To do this we create MyMapNode with Key Value Pair and create LinkedList of MyMapNode*/

package com.bridgelab;

public class HashTableMain {
    public static void main(String[] args) {
        //HashTableExp Object for Generic Type
        MyMapNode<String> myMapNode = new MyMapNode<>();

        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String strArr[] = str.split(" ");

        //System.out.println("Given String ="+str);
        //Passing Array Element in HashTable Index
        for(String mystr : strArr) {
            //Get index of each object
            int index = myMapNode.myHashFunction(mystr);
            //Store Element in Hash Table at given index
            myMapNode.storeKey(index,mystr);
        }

        //Methode to Show Hash Table Data
        myMapNode.showHashList();
    }
}
