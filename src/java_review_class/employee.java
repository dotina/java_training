package java_review_class;

/**
 * Created by
 * @author Derrick on 15-Apr-18.
 */
public class employee {
    String name;
    int age;
    String destination;
    double salary;

    public employee(String name, double salary) {
        this.name = name;
        if (salary>0.0)this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("name "+name);
        System.out.println("Age "+age);
        System.out.println("Destination "+destination);
        System.out.println("Earns... "+salary);
    }
}
