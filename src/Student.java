public class Student extends Person {


    double gpa;


//    constructor
    Student(String first, String last, double gpa) {
//        refers to the parent (Person)
        super(first, last);
        this.gpa = gpa;

    }

    void showGPA(){
        System.out.println(this.first + "'s GPA is: "+ this.gpa);
    }

}
