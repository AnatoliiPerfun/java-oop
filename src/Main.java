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
        System.out.println(newJuniorEmployee.getSalary());
        System.out.println(newLeadEmployee.getSalary());
        System.out.println(newJuniorEmployee);
        newLeadEmployee.checkGrade();
        money();
    }

    private static void money() {
        EmployeeAcc employeeAcc = new EmployeeAcc("Joe", 10000);

        employeeAcc.withdraw(500);
        employeeAcc.deposit(5000);

        System.out.println(employeeAcc.getOwner());
        System.out.println(employeeAcc.getBalance());
    }
}
