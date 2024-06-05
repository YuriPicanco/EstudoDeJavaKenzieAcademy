package src.exceptions;

public class notFoundException extends Exception{
    public notFoundException(){
        super("Not Found");
    }

    public notFoundException(String msg){
        super(msg);
    }
}
