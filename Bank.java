import java.util.*;
public class Bank {
    ArrayList<Account> accounts;
    long accNo = 1;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Create account
    public void createAccount(String accType, String Name, String contact, int age, double initial_bal) {
        Account newAccount;
        if (accType.equalsIgnoreCase("Savings")) {
            newAccount = new Savings(Name, accNo, contact, age, initial_bal);
        } else if (accType.equalsIgnoreCase("Current")) {
            newAccount = new Current(Name, accNo, contact, age, initial_bal);
        } else {
            throw new IllegalArgumentException("Invalid account type specified.");
        }
        accounts.add(newAccount);
        newAccount.getDetails();
        accNo = accNo + 1;
    }

    // Find the account object with a given account number
    public Account findAccountByNumber(long accNo) {
        for (Account account : accounts) {
            if (account.getAccNumber() == accNo) {
                return account;
            }
        }
        return null;
    }

    // Find the account object with a given phone number
    public Account findAccountByContact(String contact) {
        for (Account account : accounts) {
            if (account.getContact().equals(contact)) {
                return account;
            }
        }
        return null;
    }

    // Transfer money
    public void transfer(long from, String receiver_contact, double amount) {
        Account fromacc = findAccountByNumber(from);
        Account toacc = findAccountByContact(receiver_contact);
        if (fromacc == null || toacc == null) {
            System.out.println("Account not found.");
            return;
        }
        if (amount <= fromacc.getBalance()) {
            fromacc.withdraw(amount);
            toacc.deposit(amount);
        } else {
            System.out.println("Transfer is not possible due to insufficient balance.");
        }
    }
}
