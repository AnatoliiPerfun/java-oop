public class Main {
    public static void main(String[] args) {
        Employee newJuniorEmployee = new Employee(
                        "Joe",
                        "Kiev",
                        3000,
                        25,
                        Grade.JUNIOR);

        Employee newLeadEmployee = new Employee(
                "Todd",
                "Kiev",
                5000,
                30,
                Grade.LEAD);

        newJuniorEmployee.raiseSalary();
        newLeadEmployee.raiseSalary();
        System.out.println(newJuniorEmployee.salary);
        System.out.println(newLeadEmployee.salary);
        newJuniorEmployee.checkGrade();
        newLeadEmployee.checkGrade();
    }
}
