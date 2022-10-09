package UPI;

import BankPrototype.Account;
import CustomExceptionHandling.InsufficientBalanceException;
import CustomExceptionHandling.SameAccountException;

public class UPI{
    public int upiId;
    public Account account;

    public UPI(int upiId, Account account) {
        this.upiId = upiId;
        this.account = account;
    }

    public void transfer(float amount, UPI destinationID) throws InsufficientBalanceException, SameAccountException {
        if(destinationID==this){
            throw new SameAccountException("select diffrent account !");
        }
        else{
            this.account.withdrawal(amount);
            destinationID.account.deposit(amount);
        }
    }
}
