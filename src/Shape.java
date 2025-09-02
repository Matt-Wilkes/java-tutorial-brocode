public abstract class Shape {

    abstract double area(); // ABSTRACT - HAS TO BE IMPLEMENTED IN CHILD

    void display(){
        //CONCRETE
        System.out.println("This is a shape");
    }
}
