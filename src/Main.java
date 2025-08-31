//Main class needed for code to run
public class Main {
//    method needed in order for program to run
    public static void main(String[] args){

//    Variables
//        primitive = Simple value stored directly in memory (stack)
//        reference = memory address (stack) that points to the (heap)
//        primitive = int, double, char, boolean
//        reference = string, array, object

//       2 steps: 1. declaration and 2. assignment
//        declaration
        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

//        chars use single quotes ''
        char grade = 'A';
        char symbol = '!';
        char currency = '£';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

//        Strings use double quotes ""
        String name = "Matt ";
        String food = "Tuna";
        String email = "fake@example.com";
        String car = "mustang";
        String color = "red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale ");
        } else{
            System.out.println("There is not a car for sale");
        }
    }
}
