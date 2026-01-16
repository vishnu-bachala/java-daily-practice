package inheritence;

import java.util.Scanner;

class Animal{
    String name;
    String category;

    void bark(){
        System.out.println(this.name+" is barking");
    }
}
class Lion extends Animal{
    String meal_type="non-veg";
    void eat(){
        System.out.println(this.name +" eats "+this.meal_type);
    }
}
public class Test {
    final static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter animal name :");
        String name = sc.nextLine();

        if(name.equals("lion" )){
            Lion lion = new Lion();
            lion.name=name;
            lion.bark();
            lion.eat();
        }
        else{
            System.out.println("null");
        }

    }
}
