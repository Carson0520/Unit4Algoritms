package Searching;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cars0520
 */
public class BinarySearchObjects {

    static State state[];

    public static void main(String[] args) {
        state = new State[50];
        fillData();
        //print all the states
        for (State x : state) {
            System.out.println(x);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter state to search for popualtion: ");
        String x = s.next();
        State temp = new State(x); //create State object to send into search
        int loc = search(state, temp);
        if (loc == -1) {
            System.out.println("State not found");
        } else {
            System.out.println("The Population of " + state[loc].getName() + " is " + state[loc].getPopulation());
        }
    }

    public static int search(Object[] a, Object searchValue) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result == 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public static State[] fillData() {
        state[0] = new State("Alabama");
        state[1] = new State("Alaska");
        state[2] = new State("Arizona");
        state[3] = new State("Arkansas");
        state[4] = new State("California");
        state[5] = new State("Colorado");
        state[6] = new State("Connecticut");
        state[7] = new State("Delaware");
        state[8] = new State("Florida");
        state[9] = new State("Georgia");
        state[10] = new State("Hawaii");
        state[11] = new State("Idaho");
        state[12] = new State("Illinois");
        state[13] = new State("Indiana");
        state[14] = new State("Iowa");
        state[15] = new State("Kansas");
        state[16] = new State("Kentucky");
        state[17] = new State("Louisiana");
        state[18] = new State("Maine");
        state[19] = new State("Maryland");
        state[20] = new State("Massachusetts");
        state[21] = new State("Michigan");
        state[22] = new State("Minnesota");
        state[23] = new State("Mississippi");
        state[24] = new State("Missouri");
        state[25] = new State("Montana");
        state[26] = new State("Nebraska");
        state[27] = new State("Nevada");
        state[28] = new State("New Hampshire");
        state[29] = new State("New Jersey");
        state[30] = new State("New Mexico");
        state[31] = new State("New York");
        state[32] = new State("North Carolina");
        state[33] = new State("North Dakota");
        state[34] = new State("Ohio");
        state[35] = new State("Oklahoma");
        state[36] = new State("Oregon");
        state[37] = new State("Pennsylvania");
        state[38] = new State("Rhode Island");
        state[39] = new State("South Carolina");
        state[40] = new State("South Dakota");
        state[41] = new State("Tennessee");
        state[42] = new State("Texas");
        state[43] = new State("Utah");
        state[44] = new State("Vermont");
        state[45] = new State("Virginia");
        state[46] = new State("Washington");
        state[47] = new State("West Virginia");
        state[48] = new State("Wisconsin");
        state[49] = new State("Wyoming");
        return state;
    }
}
