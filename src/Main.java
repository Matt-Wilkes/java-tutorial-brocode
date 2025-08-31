import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double number4;
        double number5;
        double number6;
        number4 = random.nextDouble(1, 101);
        number5 = random.nextDouble(1, 101);
        number6 = random.nextDouble(1, 101);

        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);

        boolean isHeads;

        isHeads = random.nextBoolean();
        System.out.println(isHeads);
    }
}
