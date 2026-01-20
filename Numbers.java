package org.recursion;

import java.util.Scanner;

public class Numbers {

    static void firstNTerms(int n){
        if(n<1){
            return;
        }
        firstNTerms(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= in.nextInt();
        firstNTerms(n);

    }
}
