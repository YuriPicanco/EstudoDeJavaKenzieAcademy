package src.exceptions;

public class negativePriceException extends Exception {
    public negativePriceException(){
        super("Negative Price");
    }

    public negativePriceException(String msg){
        super(msg);
    }
}