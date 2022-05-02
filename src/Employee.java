public class Employee {
    private final String name;
    private final String location;
    private double salary;
    private final int age;
    private final Grade grade;

    public Employee(String name, String location, double salary, int age, Grade grade) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public Grade getGrade() {
        return grade;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.5;
    }
    public void checkGrade() {
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
