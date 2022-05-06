public class Salesperson  extends Employee{
    private double commissionPerc;

    public Salesperson(String name, double salary, int age, Grade grade, double commissionPerc) {
        super(name, salary, age, grade);
        this.commissionPerc = commissionPerc;
    }
    public double getCommissionPerc() {
        return this.commissionPerc;
    }
    public void raiseCommission() {
        if (this.commissionPerc < .30) {
            this.commissionPerc = this.commissionPerc * 1.2;
        }
    }
}
