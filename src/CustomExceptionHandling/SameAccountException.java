package CustomExceptionHandling;

public class SameAccountException extends Exception{
    public SameAccountException(String str){
        super(str);
    }
}

