package com.kata.app;
import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testDepositeOk() throws Exception {
        Account User1 = new Account();
        User1.deposit(200);
        double balance = User1.getBalance();
        Assert.assertEquals(200, balance,0);
    }

    @Test
    public void testDepositKO() throws Exception {
        try {
            Account User = new Account();
            User.deposit(3000);
        }
        catch(Exception aExp){
            assert(aExp.getMessage().contains("Depot Impossible"));
        }
    }

    @Test
    public void testAccountWithdrawOk() throws Exception {
        Account User = new Account();
        User.deposit(2000);
        User.withdrawal(100);
        double balance = User.getBalance();
        Assert.assertEquals(1900,balance,0);
    }

    @Test
    public void testWithdrawKO() throws Exception {
        try {
            Account User = new Account();
            User.deposit(2000);
            User.withdrawal(2500);
        }
        catch(Exception aExp){
            assert(aExp.getMessage().contains("Retrait Impossible"));
        }
    }

    @Test
    public void testPrintStatement() throws Exception {
        Account User = new Account();
        User.deposit(2000);
        User.withdrawal(1000);
        User.deposit(3000);
        User.withdrawal(400);
        User.print();
    }
}
