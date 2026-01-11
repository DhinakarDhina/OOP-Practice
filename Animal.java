package AbstractionPractice;

import java.util.Scanner;

abstract class Animal {
    String name;

    Animal(String name){
        this.name=name;
    }
    abstract void makeSound();
}
  class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("The dog "+name+" says : Woff!");
    }

}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("The cat "+name+" says: Meow!");
    }
}
 class main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dog name: ");
        String dog=in.nextLine();
        System.out.println("Enter the cat name: ");
        String cat= in.nextLine();
        Animal d= new Dog(dog);
        d.makeSound();
        Animal c= new Cat(cat);
        c.makeSound();
    }
}