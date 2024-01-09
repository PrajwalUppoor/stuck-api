package com.puppoor.stuck.splitwise;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class UserManagement implements Comparable<User>{

    private HashMap<User, ArrayList<User>> expenditures;

    public UserManagement(){

    }

    //Ordering of Expenses
    @Override
    public int compareTo(@NotNull User o) {
        return 0;
    }

    public  HashMap<User, ArrayList<User>> addExpenditures(User user, String name, Expense expense, double amount){

        if(expenditures.containsKey(user.getId())){
            ArrayList<User> group=expenditures.get(user.getId());
            User userb=new User(name,amount,expense);
            if(group.contains(userb)){
                double amt= group.get(group.indexOf(userb)).getAmount();
                group.get(group.indexOf(userb)).setAmount(amt+amount);
                split(group,user);
            }
            else{
                group.add(userb);
                split(group,user);
            }
        }

        User userb=new User(name,amount,expense);
        ArrayList<User> group=new ArrayList<>();
        group.add(userb);
        split(group,user);
        expenditures.put(user, group);
        return expenditures;
    }
///how much a ows b
    public double persontoperson(User usera, User userb){
        if(expenditures.containsKey(usera.getId())){
            ArrayList<User> group=expenditures.get(usera.getId());
            if(group.contains(userb)){
                return userb.getAmount();
            }
            return 0;
        }
        return 0;
    }
    public void split( ArrayList<User> group,User user){
        if(user.getExpense()==Expense.EQUAL){
            double total=0;
            for (User usr:
                 group) {
                total+=usr.getAmount();
            }
            double expense=total/ group.size();
            for (User usr:
                    group) {
                usr.setAmount(expense);
            }
        }
        else if(user.getExpense()==Expense.PERCENTAGE){
//            double total=0;
//            for (User usr:
//                    group) {
//                total+=usr.getAmount();
//            }
//            double expense=total/ group.size();
//            for (User usr:
//                    group) {
//                usr.setAmount(expense);
//            }
            /// some buisness logic for finding percentage

        }
        else{
    //// exact expenditure leave as it is
        }
    }

    public boolean removeusergroup(User user){
        if(expenditures.containsKey(user)){
            expenditures.remove(user);
            return true;
        }
        return false;
    }

    public ArrayList<User> findexpenseofuser(User user){
       return expenditures.get(user);
    }




}
