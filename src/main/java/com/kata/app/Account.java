package com.kata.app;


public class Account {

    private double balance;

    private Statement statement;

    private double minBalance;

    private double maxBalance;

    public Account(){
        statement=new Statement();
        balance=0;
        this.maxBalance=2000;
        this.minBalance=-200;
    }
    public Account(double balance,double minBalance, double maxBalance){
        this();
        this.balance=balance;
        this.maxBalance=maxBalance;
        this.minBalance=minBalance;
    }

    public void withdrawal(double amount){


        try {
            if((balance-amount)>= minBalance){
                Operation operation=new Operation("WITHDRAWAL",amount);
                statement.addOperation(operation);
                balance-=amount;
                System.out.println("Operation reussi");
            }
            else
            throw new Exception("Retrait Impossible");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deposit(double amount){

        try {
            if((balance+amount)<= maxBalance){
                Operation operation=new Operation("DEPOSIT   ",amount);
                statement.addOperation(operation);
                balance+=amount;
                System.out.println("Operation reussie");
            }
            else{
                throw new Exception("Depot Impossible");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void  print(){
        System.out.println("HISTORY: ");
        System.out.println("*************************************");
        System.out.println("OPERATION    MONTANT    DATE ");
        System.out.println("*************************************");
        System.out.println(statement.print());
        System.out.println("SOLDE:   "+balance);
        System.out.println("END");
    }

    public double getBalance() {
        return balance;
    }

}
