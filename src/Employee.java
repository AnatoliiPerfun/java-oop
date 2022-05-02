public class Employee {
    String name;
    String location;
    double salary;
    int age;
    Grade grade;

    public Employee(String name, String location, double salary, int age, Grade grade) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
        this.grade = grade;
    }
    void raiseSalary() {
        this.salary = this.salary * 1.5;
    }
    void checkGrade() {
        if (this.salary < 3000) {
            System.out.println( this.name + " is a junior");
        }
        if (this.salary < 5000) {
          System.out.println(this.name + " is a senior");
        } else {
            System.out.println(this.name + " is a team lead");
        }
    }

}
