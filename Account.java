import java.util.Scanner;
public class Account
{
    private String name;
    private double balance;
    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            balance = balance + depositAmount;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Account account1 = new Account("Musa", 0.00);
        Account account2 = new Account("Mahmud", 0.00);

        //display Initial Balance
        System.out.printf("%s Initial Balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s Initial balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter Deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);

        account1.deposit(depositAmount);

        System.out.printf("%s balance is: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance is :$%.2f%n",account2.getName(), account2.getBalance());

        System.out.printf("Enter Deposit Amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);

        account2.deposit(depositAmount);

        System.out.printf("%s balance is: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance is : $%.2f%n",account2.getName(),account2.getBalance());
        /*
         * System.out.printf("account1 name is : %s%n",account1.getName());
        System.out.printf("account2 name is : %s%n",account2.getName());
         */
        
    }
}