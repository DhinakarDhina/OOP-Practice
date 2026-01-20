package org.sum_recursion;

import java.util.Scanner;

public class UsingFunction {

    static int sumOfNUsingFun(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNUsingFun(n-1);

    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= in.nextInt();
        System.out.println(sumOfNUsingFun(n));
    }
}
