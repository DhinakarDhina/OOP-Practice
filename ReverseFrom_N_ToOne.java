package org.reverse;

import java.util.Scanner;

public class ReverseFrom_N_ToOne {

    static void NToOne(int i,int n){
        if(i>n){
            return;
        }
        NToOne(i+1,n);
        System.out.println(i);


    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= in.nextInt();
        NToOne(1,n);

    }

}
