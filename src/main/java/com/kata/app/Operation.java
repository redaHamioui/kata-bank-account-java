package com.kata.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount){
        this.setAmount(amount);
        this.setType(type);
        this.setDate(new Date());
    }

    public Operation(String type, double amount, Date date ){
        this(type,amount);
        this.setDate(date);
    }

    public String print(){
        String operation= new String();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        operation= type +"  "+amount+"  "+ dateFormat.format(date);
        return operation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}