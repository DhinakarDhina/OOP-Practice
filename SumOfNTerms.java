package org.sum_recursion;

import java.util.Scanner;

public class SumOfNTerms {

    static void sumOfTerms( int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumOfTerms(n-1,sum+=n);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= in.nextInt();
        sumOfTerms(n,0);
    }
}
