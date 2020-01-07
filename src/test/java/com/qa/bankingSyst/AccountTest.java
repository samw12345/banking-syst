package com.qa.bankingSyst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    public AccountTest(){

    }
    @Test
    public void test_does_balance_equal_opening_amount_in_account(){
        //arrange & act
        double openingBalance = 56.78;

        Account account = new Account(1,"Eric", openingBalance);


        //assert
        assertEquals(openingBalance, account.AvailableBalance());
        assertEquals(openingBalance, account.CurrentBalance());
    }

}