public class Current extends Account {
    final static double overdraft_limit = 16000;

    public Current(String name, long accNo, String contact, int age, double initial_bal) {
        super(name, accNo, contact, age, initial_bal);
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() + overdraft_limit >= amount) {
            double netbalance = this.getBalance() - amount;
            this.setBalance(netbalance);
            this.getDetails();
        } else {
            System.out.println("Balance is insufficient.");
        }
    }
}