package Recursion;

import java.util.Scanner;

/**
 *
 * @author cars0520
 */
public class Fibonacci {
    
    static int reccalls =0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to calculate in fibonacci sequence: ");
        int num = s.nextInt();
        int fibnum = fib(num);
        int fibnum2 = recfib(num);
        System.out.format("fib(%d) = %d\n", num, fibnum);
        System.out.format("recfib(%d) = %d\n", num, fibnum2);
        System.out.println("recfib was called  " + reccalls + " times.");

    }

    public static int recfib(int num) {
        reccalls++;
        if (num == 1 || num == 2) {
            return num - 1;
        } else {
            return recfib(num - 1) + recfib(num - 2);
        }
    }

    public static int fib(int num) {
        if (num < 3) {
            return num - 1;
        }
        int num1 = 0, num2 = 1;
        int fib = 0;
        for (int i = 3; i <= num; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }

}
