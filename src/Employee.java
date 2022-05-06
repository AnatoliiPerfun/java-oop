public class Employee {
    protected String name;
    protected double salary;
    protected final int age;
    protected Grade grade;

    protected Employee(String name, double salary, int age, Grade grade) {
        this.name = name;
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
    public Grade getGrade() {
        return grade;
    }
}
