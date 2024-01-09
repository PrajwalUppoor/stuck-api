package com.puppoor.stuck.splitwise;

public class Splitwise {
    public static void main(String[] args) {

        User user=new User("Prajwal Uppoor",0,Expense.EQUAL);
        UserManagement usrman=new UserManagement();
        usrman.addExpenditures(user,"Shilpa",Expense.PERCENTAGE,20.30);

    }

}
