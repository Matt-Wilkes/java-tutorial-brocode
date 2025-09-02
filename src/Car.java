public class Car extends Vehicle {

//    String make;
//    String model;
//    int year;
//    String color;
//
//    Car(String make, String model, int year, String color){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.color = color;
//    }
//
//    void drive(){
//        System.out.println("You drive the " + this.color + " " + this.model);
//    }
//
//    @Override
//    public String toString(){
//        return this.color + " " + this.year + " " + this.make + " " + this.model;
//    }

    @Override
    void go(){
        System.out.println("You drive the car");
    }
}
