package com.hrynevych.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class DatabaseRunner {
    public static void main(String[] args) {
        Account account1 = new Account("JohnSmith", "qwerty");
        Account account2 = new Account("CoolGuy", "12344321");
        Account account3 = new Account("buddy007", "qweasd");

        List<Account> accounts= new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        AccountsDB accountsDB = new AccountsDB(accounts);

        Iterator<String> userIterator = accountsDB.getIterator(Access.USER);

        while (userIterator.hasNext()){
            System.out.println(userIterator.next());
        }

        System.out.println();

        Iterator<Account> adminIterator = accountsDB.getIterator(Access.ADMIN);

        while (adminIterator.hasNext()) {
            System.out.println(adminIterator.next().toString());
        }

    }
}
