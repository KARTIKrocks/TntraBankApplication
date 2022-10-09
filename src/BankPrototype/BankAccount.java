package BankPrototype;

import CustomExceptionHandling.InsufficientBalanceException;

public interface BankAccount {
    void withdrawal(float amount )throws InsufficientBalanceException;
    void deposit(float amount );


}
