package Test;

import Game.Account;

import static org.junit.Assert.*;

public class AccountTest {

    @org.junit.Test
    public void getPoints() {
        Account account = new Account();
        account.addPoints(-1100);
        assertTrue(account.getPoints() == 0);
    }
}