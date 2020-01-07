package tests;

import com.qa.bankingSyst.Account;

public class MainUnit {
    public static void main(String[] args){

        test_current_balance_equals_available_balance();

        test_does_balance_match_after_credit();

        test_does_balance_match_after_debit();
        // Account acc =new Account(890,"Billy goat",50);
        // System.out.println(acc.currentBalance());
        //acc.availableBalance();
        //System.out.println(acc.availableBalance());
        //acc.Credit(3570);
        // System.out.println(acc.availableBalance());
        // System.out.println(acc.currentBalance());

    }

    public static void test_current_balance_equals_available_balance(){
        double openingBalance = 56.78;

        Account account = new Account(1,"Eric", openingBalance);

        //assert
        if(openingBalance== account.AvailableBalance() && openingBalance ==account.CurrentBalance()){
            System.out.println("All good");
        }
        else{
            System.out.println("ooops");
        }
    }
    public static void test_does_balance_match_after_credit(){
        //arrange
        double openingBalance2=56.78;
        double amounttodeposit=44.00;
        Account account2 = new Account(2,"Eric", openingBalance2);

        //act
        account2.Credit(amounttodeposit);

        //assert
        if((openingBalance2+amounttodeposit)==account2.AvailableBalance() && (openingBalance2+amounttodeposit)==account2.CurrentBalance()){
            System.out.println("All good");
        }
        else{
            System.out.println("bad");
        }
    }
    public static void test_does_balance_match_after_debit(){
        //arrange
        double openingBalance2=56.00;
        double amounttowithdraw=44.00;
        Account account3 = new Account(3,"Eric", openingBalance2);

        //act
        account3.Debit(amounttowithdraw);

        //assert
        if((openingBalance2-amounttowithdraw)==account3.AvailableBalance() && (openingBalance2-amounttowithdraw)==account3.CurrentBalance()){
            System.out.println("All good");
        }
        else{
            System.out.println("bad");
        }
    }
}
