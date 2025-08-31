
public class Main {

    public static void main(String[] args){
//  %[flags][width][.precision][specifier-character]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

//        string interpolation - Insert a placeholder
//        %s is used as a placeholder for String
        System.out.printf("Hello %s\n", name);
//        %c is used as a placeholder for char
        System.out.printf("Your name starts with an %c\n", firstLetter);
//        %d is used as a placeholder for int
        System.out.printf("You are %d years old\n", age);
//        %f is used as a placeholder for double
        System.out.printf("You are %f inches tall\n", height);
//        %b is used as a placeholder for boolean
        System.out.printf("Employed: %b\n", isEmployed);

//        use multiple
//        use placeholders and then add the variables in order
        System.out.printf("%s is %d years old\n", name, age);

//        use precision to limit the output
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

//        add precision between % and placeholder f
        System.out.printf("%.1f\n", price1);//10.0
        System.out.printf("%.2f\n", price2); // 100.15
        System.out.printf("%.3f\n", price3); //-54.010

// [flags]
//        + = output a plus
//        , = comma grouping seperator
//         ( = negative numbers are enclosed in ()
//        space = display a minus if negative, space if positive

        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;
        double price7 = 64000.01;
        double price8 = -64000.01;

        System.out.printf("%+.2f\n", price4); //+9000.99
        System.out.printf("%,.2f\n", price5); //100,000.15
        System.out.printf("%(.3f\n", price6); //(54000.010)
        System.out.printf("% .3f\n", price7); // 64000.010
        System.out.printf("% .3f\n", price8); //-64000.010

//        [width]
//        0 = zero padding
//        number = right justified padding
//        negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = -456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); //0001
        System.out.printf("%03d\n", id2); //023
        System.out.printf("%6d\n", id3); //  -456
        System.out.printf("%04d\n", id4);//7890
    }
}
