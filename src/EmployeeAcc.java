public class EmployeeAcc {
    private final String owner;
    private double balance;

    public EmployeeAcc(String owner, double startBalance) {
        this.owner = owner;
        this.balance = Math.max(startBalance, 0);
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            this.balance = this.balance + amt;
        }
    }
    public void withdraw(double amt) {
        if (amt <= this.balance) {
            this.balance = amt;
        }
    }
}
