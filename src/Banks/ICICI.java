package Banks;

import BankPrototype.Account;
import CustomExceptionHandling.InsufficientBalanceException;
import CustomExceptionHandling.ProvideMinimumBalanceException;
import Enums.AccountType;

public class ICICI extends Account {

    public ICICI(String ownerName, float balance, AccountType accType, float overdraft) throws ProvideMinimumBalanceException {
        super(ownerName, balance, accType, overdraft);
    }

    @Override
    public void withdrawal(float amount ) throws InsufficientBalanceException {
        super.withdrawal(amount);
        System.out.println("Money withdrawn from ICICI");
    }

    public  void deposit(float amount){
        super.deposit(amount);
        System.out.println("thank you !");
    }

}
