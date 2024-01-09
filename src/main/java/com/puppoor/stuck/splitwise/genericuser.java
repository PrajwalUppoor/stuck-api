package com.puppoor.stuck.splitwise;

abstract class genericuser {
    private int id;
    private String name;
    private double amount;
    private Expense expense;

    public genericuser(int id, String name, double amount, Expense expense) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.expense = expense;
    }
    
}
