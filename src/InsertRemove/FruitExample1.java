/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertRemove;

/**
 *
 * @author cars0520
 */
public class FruitExample1 {

    static int logicalSize = 4;
    static String fruits[] = new String[10];

    public static void main(String[] args) {

        fruits[0] = "Apple";
        fruits[0] = "Cherries";
        fruits[0] = "Lemon";
        fruits[0] = "Orange";
        showList();
        
        System.out.println("------------------------");
        System.out.println("Adding Kiwi to list");
        int loc = findInsertPoint(fruits, "Kiwi");
        insert(fruits, "Kiwi", loc);
        showList();

        System.out.println("------------------------");
        System.out.println("Adding Strawberry to list");
        loc = findInsertPoint(fruits, "Strawberry");
        insert(fruits, "Strawberry", loc);
        showList();

        System.out.println("------------------------");
        System.out.println("Adding Bananna to list");
        int loc = findInsertPoint(fruits, "Bananna");
        insert(fruits, "Bananna", loc);
        showList();

        System.out.println("--------------------------------");
        System.out.println("Removing Cherries and Ornage from the list");

        loc = search(fruits, "Cherries");
        delete(fruits, loc);

        loc = search(fruits, "Orange");
        delete(fruits, loc);

        showList();
    }

    public static void showList() {
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(i);

        }
    }

    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }//end if
            }//end for
        }//end while
    }

//supporting swap method
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
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
/////////////////////////////////////////////////////////////
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

}
