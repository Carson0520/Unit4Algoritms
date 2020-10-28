/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertRemove;

import java.util.ArrayList;

/**
 *
 * @author cars0520
 */
public class FruitExampleArrayList {

    static ArrayList<String> fruit = new ArrayList();

    public static void main(String[] args) {
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Pear");

        System.out.println("I have " + fruit.size() + " fruits:");

        for (String f : fruit) {
            System.out.println(f);
        }

        System.out.println("The first fruit is " + fruit.get(0));
        System.out.println("Changing apple to avacado");
        fruit.set(0, "Avacado");

        System.out.println("Adding Bananna to location 1:");
        int loc = findInsertPoint(fruit, "Banana");
        fruit.add(loc, "Bananna");

        System.out.println("Taking out Mango");
        loc = fruit.indexOf("Mango");
        fruit.remove(loc);

        System.out.println("------------------------------------");

        for (String f : fruit) {
            System.out.println(f);
        }
    }
     public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }//end else// j+1 is where the item goes
                a[j + 1] = itemToInsert;
            }//end while
        }//end for
    }//end method
public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;

    }
}
}
