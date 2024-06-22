import java.util.*;


// start of the project 
abstract public class Account{// abstract account class
    private String accHolderName;//encapsulation using private data and public getter and setter methods.
    private long accNumber;
    private String contactNo;
    private int age;
    private double balance;

    public Account(String name,long accNo,String contactNo,int age,double balance){
        this.accHolderName=name;
        this.accNumber=accNo;
        this.contactNo=contactNo;
        this.age=age;
        this.balance=balance;
    }

   abstract public void withdraw(double amount);// abstract withdraw method

   public  void getDetails(){
     System.out.println("Name: "+accHolderName+"  accNo: "+accNumber+"  Current Balance: "+balance);
   }

   public void deposit(double amount){
     this.balance+=amount;
     
   }

   public double getBalance(){
    return this.balance;
   } 

   public void setBalance(double amount){
     this.balance=amount;
   }

   public long getAccNumber(){
    return this.accNumber;
   }

   public String getContact(){
    return this.contactNo;
   }

   public String getAccHolderName() {
    return this.accHolderName;
   }

   public void setAccHolderName(String name) {
    this.accHolderName = name;
   }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
