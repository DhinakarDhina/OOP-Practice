package PolymorphismPractice;

import java.util.Scanner;

public class ShapeCalculator {
    int radius;
    int length;
    int width;
    int base1;
    int base2;
    int height;
    final float pi = 3.14F;

    public void area(int radius){
        System.out.println("Area of the circle: "+pi*radius*radius);
    }
    public void area(int length, int width){
        System.out.println("Area of the rectangle: "+ length*width);
    }
    public void area(int base1,int base2, int height){
        System.out.println("Area of trapezoid: "+ (base1+base2)*height/2);
    }

}
class main{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ShapeCalculator s= new ShapeCalculator();
        s.area(4);
        s.area(2,4);
        s.area(4,5,6);

    }
}
