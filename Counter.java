package StaticPractice;

import java.util.Scanner;

public class Counter {
    static int count;
    Counter(){
        count++;
    }
    static int getCount(){
        return count;
    }
    static int resetCount(){
        return count=0;
    }
}
class main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the count value: ");
        int count_val= in.nextInt();

        for(int i=0; i<count_val;i++){
            Counter c= new Counter();
        }
        int result=Counter.getCount();
        System.out.println(result);
        int reset= Counter.resetCount();
        System.out.println(reset);


    }
}