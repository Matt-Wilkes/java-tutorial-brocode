import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);
//      Enter the number of food you would like: 4
//      Enter food #1: pizza
//      Enter food #2: HotDog
//      Enter food #3: Hamburger
//      Enter food #4: Taco
//      [pizza, HotDog, Hamburger, Taco]

    scanner.close();

    }
}
