package BankPrototype;

import CustomExceptionHandling.InsufficientBalanceException;
import CustomExceptionHandling.ProvideMinimumBalanceException;
import Enums.AccountType;
public abstract class Account implements BankAccount {
    public String ownerName;
    public float balance;
    public AccountType AccType;
    public float overdraft;

    public Account(String ownerName, float balance, AccountType accType, float overdraft) throws ProvideMinimumBalanceException {
        if (balance<1000) {
            throw new ProvideMinimumBalanceException("please add amount greater than 1000 rupee ! ");
        }else {
            this.balance = balance;
            this.ownerName = ownerName;
            this.AccType = accType;
            this.overdraft = overdraft;
        }


    }

    public void withdrawal(float amount ) throws InsufficientBalanceException {
        if (this.AccType==AccountType.savings) {
            if (this.balance < amount) {
                throw new InsufficientBalanceException("Insufficient Balance !");
            } else {
                this.balance = this.balance - amount;
                System.out.println("total amount : " + this.balance);
            }
        }
        if (this.AccType==AccountType.current){
            if (amount > (this.balance + (this.overdraft*this.balance/100) )){
                throw new InsufficientBalanceException("Insufficient Balance !");
            }
            else {
                this.balance = this.balance - amount;
                System.out.println("total amount : " + this.balance);
            }
        }
    }

    public  void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.println("deposited ! \ntotal amount : "+ this.balance);
    };

    public String getOwnerName() {
        return this.ownerName;
    }

    public float getBalance() {
        return this.balance;
    }

    public AccountType getAccType() {
        return this.AccType;
    }

    public float getOverdraft() {
        return this.overdraft;
    }

}
