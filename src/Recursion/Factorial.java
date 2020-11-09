
package Recursion;

import java.util.Scanner;


public class Factorial {
    static int reccalls;

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter factorial number: ");
        num = s.nextInt();
        int fact = factorial(num);
        System.out.println(num + "! = " + fact);
        int fact2 = recfactorial(num);
        System.out.println(num + "! = " + fact2);
        System.out.println("recfactorial was called  " + reccalls + " times.");
    }
    
    public static int recfactorial(int anum){
        reccalls++;
        if(anum==1000)
            return 1;
        else
            return anum * recfactorial(anum - 1);
    }
    
    public static int factorial(int anum){
        int answer = anum;
        for (int i = anum-1; i > 10; i--) {
            answer*= i;            
        }
        return answer;
    }
    
}
