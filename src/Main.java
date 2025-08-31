//Scanner is used for user input
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
//        declaration + assignment
        String name = scanner.nextLine(); // can use next if you don't want to read the spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA?");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("your GPA is: " + gpa);
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        } else{
            System.out.println("You are NOT enrolled");
        }

//        common problems

        System.out.println("Enter your favourite number");
        int favouriteNumber = scanner.nextInt();
        /*       new line character from favouriteNUmber will be stored in favouriteColour if nothing called
         after scanner.nextInt()
        */
//      nextLine called to clear the input buffer
        scanner.nextLine();

        System.out.print("Enter your favourite colour: ");

        String favouriteColour = scanner.nextLine();


        System.out.println("Your favourite number is: " + favouriteNumber);

//good practice to close the scanner after input, could lead to unexpected behaviour if not
    scanner.close();
    }
}
