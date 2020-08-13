package com.thoughtworks.tddintro.exercises.accountbalance;

import com.thoughtworks.tddintro.exercises.factorial.Factorial;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        assertThat(account.deposit(100, 50), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account();
        assertThat(account.withdrawal(100, 50), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account();
        assertThat(account.withdrawal(50, 100), is(50));
    }
}
