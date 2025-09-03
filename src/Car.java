public class Car extends Vehicle {

//    final can be used for extra protection to prevent a variable being modified
    private final String model;
    private String color;
    private int price;
    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "£" + this.price;
    }

//    No setModel method because we don't want this to be writeable

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price){

        if (price < 0){
            System.out.println("Price can't be less than zero");
        } else {
            this.price = price;
        }
    }
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
