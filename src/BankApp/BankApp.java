package BankApp;

import BankPrototype.Account;
import Banks.HDFC;
import Banks.ICICI;
import CustomExceptionHandling.InsufficientBalanceException;
import CustomExceptionHandling.ProvideMinimumBalanceException;
import CustomExceptionHandling.SameAccountException;
import Enums.AccountType;
import UPI.UPI;

public class BankApp {
    public static void main(String[] args) throws InsufficientBalanceException, SameAccountException, ProvideMinimumBalanceException {

        HDFC a1 = new HDFC("kartik",1000,AccountType.savings,10);
        ICICI b1 = new ICICI("paras" , 8000, AccountType.savings,10);

        UPI u1 = new UPI(111,a1);
        UPI u2 = new UPI(222,b1);
        u1.transfer(2,u2);

        System.out.printf("a1 balance = %s\na2 balance = %s%n", a1.getBalance(), b1.getBalance());

    }
}
