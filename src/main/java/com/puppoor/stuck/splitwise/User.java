package com.puppoor.stuck.splitwise;

public class User {
    private static volatile int count=0;
    private int id;
    private String name;
    private double amount;

    public  User(){
    }

    public User(String name, double amount, Expense expense) {
        this.name = name;
        this.amount = amount;
        this.expense = expense;
        this.id=count+=1;
    }



    private Expense expense;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public User(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
