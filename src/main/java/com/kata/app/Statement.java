package com.kata.app;

import java.util.ArrayList;

public class Statement {
    private ArrayList <com.kata.app.Operation> operations;

    public Statement(){
        operations= new ArrayList <com.kata.app.Operation> ();
    }
    public void addOperation(com.kata.app.Operation newOperation){
        operations.add(newOperation);
    }

    public String print(){

        String statement=new String();

        for(int i=0;i<operations.size();i++)
        {
            statement+=operations.get(i).print();
            statement+="\n";
        }
        return statement;
    }

}