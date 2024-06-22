public class Savings extends Account {
    final static double interest_rate = 4; // interest rate is constant

    public Savings(String name, long accNo, String contact, int age, double initial_bal) {
        super(name, accNo, contact, age, initial_bal);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            double netbalance = this.getBalance() - amount;
            this.setBalance(netbalance);
            this.getDetails();
        }
    }

    public void addInterest() {
        double interest = (this.getBalance() * interest_rate) / 100;
        double netbalance = this.getBalance() + interest;
        this.setBalance(netbalance);
        this.getDetails();
    }
}