package org.factorial_recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= in.nextInt();
        System.out.println(factorial(n));

    }
}
