import java.util.*;

public class OOPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Create Account");
            System.out.println("2 - Check Balance");
            System.out.println("3 - Deposit");
            System.out.println("4 - Withdraw");
            System.out.println("5 - Transfer");
            System.out.println("6 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            long accNumber;
            double amount;
            Account user;

            switch (choice) {
                case 1:
                    System.out.println("Enter account type (Savings/Current):");
                    String type = sc.next();
                    System.out.println("Enter your Name:");
                    String Name = sc.next();
                    System.out.println("Enter your contact Number:");
                    String contact_No = sc.next();
                    System.out.println("Enter your age:");
                    int age = sc.nextInt();
                    System.out.println("Enter your initial deposit:");
                    amount = sc.nextDouble();
                    b.createAccount(type, Name, contact_No, age, amount);
                    break;
                case 2:
                    System.out.println("Enter your account number:");
                    accNumber = sc.nextLong();
                    user = b.findAccountByNumber(accNumber);
                    if (user != null) {
                        System.out.println("Your account balance is " + user.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number:");
                    accNumber = sc.nextLong();
                    System.out.println("Enter amount:");
                    amount = sc.nextDouble();
                    user = b.findAccountByNumber(accNumber);
                    if (user != null) {
                        user.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter your account number:");
                    accNumber = sc.nextLong();
                    System.out.println("Enter amount:");
                    amount = sc.nextDouble();
                    user = b.findAccountByNumber(accNumber);
                    if (user != null) {
                        user.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter your account number:");
                    accNumber = sc.nextLong();
                    System.out.println("Enter receiver's contact No.:");
                    String phone = sc.next();
                    System.out.println("Enter amount:");
                    amount = sc.nextDouble();
                    b.transfer(accNumber, phone, amount);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Enter appropriate choice.");
                    break;
            }
        }
    }
}
