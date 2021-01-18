package com.kata.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //US 1 In order to save money
        //As a bank client
        //I want to make a deposit in my account
        Account User = new Account();
        System.out.println("Depot 2000");
        User.deposit(2000);
        System.out.println("SOLDE:"+User.getBalance());


        //US 2 In order to retrieve some or all of my savings
        //As a bank client
        //I want to make a withdrawal from my account
        System.out.println("Withdraw 1000");
        User.withdrawal(1000);
        System.out.println("SOLDE:"+User.getBalance());

        // US 3 In order to check my operations
        //As a bank client
        //I want to see the history (operation, date, amount, balance) of my
        //operations
        User.print();

    }
}
