
public class Main {

    public static void main(String[] args) {
    Person person = new Person("John","Doe");

    person.showName();
    Student student = new Student("Sam", "Smith", 3.0);
    Employee employee = new Employee("Flan", "Nell", 500000);

        student.showGPA();
        employee.showSalary();
    }
}
