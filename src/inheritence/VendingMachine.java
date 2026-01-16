package inheritence;

import java.util.Scanner;

class Drink{
    void drink(){
        System.out.println("Drink it...!" );
    }
}
class Tea extends Drink{
    void serve(){
        System.out.println("Please take tea");
    }
}
class Coffee extends Drink{
    void serve(){
        System.out.println("Please take Coffee");
    }
}

public class VendingMachine {
    void pressButton(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter '1' for Coffee :" );
        System.out.println("Enter 'any integer' for Tea : ");
        int n=scanner.nextInt();

        if(n==1){
            Coffee coffee = new Coffee();
            coffee.serve();
            coffee.drink();
        }
        else{
            Tea tea = new Tea();
            tea.serve();
            tea.drink();
        }
    }
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.pressButton();
    }
}
