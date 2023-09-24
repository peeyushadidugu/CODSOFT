import java.util.*;
class ATM
{
    public static void main(String args[])
    {
        double accountBalance=1000.0;
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        System.out.println("WELCOME TO THE BANK , CHOOSE YOUR TASK");
        System.out.println("1.WITHDRAWING");
        System.out.println("2.DEPOSITING");
        System.out.println("3.CHECKING BALANCE");
        System.out.println("5.EXIT");
        System.out.println("ENTER YOUR CHOICE");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW  : ");
            double wamt=sc.nextDouble();
            bankAccount.withdraw(accountBalance, wamt);
            break;
            case 2:
            System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT : ");
            double damt=sc.nextDouble();
            bankAccount.deposit(accountBalance, damt);
            break;
            case 3:
            System.out.println("ACCOUNT BALANCE IS "+accountBalance);
            break;
            case 4:
            System.out.println("THANK YOU FOR USING ATM");
            sc.close();
            System.exit(0);
            break;
            default:
            System.out.println("PLEASE SELECT A VALID OPTION");
            break;


        }
        
    }
    public static class BankAccount
    {
        double balance=1000.0;
        public double getBalance()
        {
            return balance;
        }
        public void deposit(double balance,double amount)
        {
            if(amount>0)
            {
                balance+=amount;
                System.out.println("DEPOSIT SUCCESSFUL"+amount);
                System.out.println("AVAILABLE BALANCE IS "+balance);
            }
            else
            {
                System.out.println("DEPOSIT INVALID");
            }
        }
        public void withdraw(double balance,double amount)
        {
            if(amount>0 && balance>amount)
            {
                balance-=amount;
                System.out.println("WITHDRAW SUCCESSFUL"+amount);
                System.out.println("AVAILABLE BALANCE IS "+balance);
            }
            else if(balance<amount)
            {
                System.out.println("INSUFFICIENT BALANCE");
            }
            else{
                System.out.println("WITHDRAW UNSUCCESSFUL");
            }
        }
    }
}