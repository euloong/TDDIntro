package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public Integer deposit(int accountBalance, int depositAmount) {
        accountBalance = accountBalance + depositAmount;
        return accountBalance;
    }

    public Integer withdrawal(int accountBalance, int withdrawalAmount) {
        if (withdrawalAmount <= accountBalance) {
            accountBalance = accountBalance - withdrawalAmount;
        }
        return accountBalance;
    }

}
