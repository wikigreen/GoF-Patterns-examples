package com.hrynevych.designpatterns.behavioral.iterator;

import java.util.List;

public class AccountsDB implements Iterable{
    List<Account> accounts;

    public AccountsDB(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Iterator getIterator(Access access) {
        return switch (access){
            case USER : yield new LoginIterator();
            case ADMIN: yield new AccountIterator();
        };
    }

    private class LoginIterator implements Iterator<String>{
        private int index = 0;
        @Override
        public String next() {
            return accounts.get(index++).getLogin();
        }

        @Override
        public boolean hasNext() {
            return accounts.size() > index;
        }
    }

    private class AccountIterator implements Iterator<Account>{
        private int index = 0;
        @Override
        public Account next() {
            return accounts.get(index++);
        }

        @Override
        public boolean hasNext() {
            return accounts.size() > index;
        }
    }

}
