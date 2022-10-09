package CustomExceptionHandling;

public class ProvideMinimumBalanceException extends Exception{
    public ProvideMinimumBalanceException(String str){
        super(str);
    }
}
