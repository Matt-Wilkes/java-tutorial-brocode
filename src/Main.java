
public class Main {

    public static void main(String[] args) {
    Car car = new Car();
    Bike bike = new Bike();
    Boat boat = new Boat();

//    car, bike and boat all have Vehicle in common
//        they all identify as vehicles
    Vehicle[] vehicles = {car, bike, boat};

    for(Vehicle vehicle: vehicles){
        vehicle.go();
    }

    }
}
