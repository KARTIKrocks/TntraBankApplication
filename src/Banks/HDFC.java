package Banks;

import BankPrototype.Account;
import CustomExceptionHandling.InsufficientBalanceException;
import CustomExceptionHandling.ProvideMinimumBalanceException;
import Enums.AccountType;

public class HDFC extends Account {
    public HDFC(String ownerName, float balance, AccountType accType, float overdraft) throws ProvideMinimumBalanceException {
        super(ownerName, balance, accType, overdraft);
    }
    @Override
    public void withdrawal(float amount ) throws InsufficientBalanceException {
        super.withdrawal(amount);
        System.out.println("Money withdrawn from HDFC");
    }

    public  void deposit(float amount){
        super.deposit(amount);
        System.out.println("thank you !");
    }



}
