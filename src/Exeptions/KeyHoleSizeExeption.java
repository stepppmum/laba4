package Exeptions;

public class KeyHoleSizeExeption extends Exception{
    public KeyHoleSizeExeption(String message){
        super(message);
    }
    public KeyHoleSizeExeption(String message, Throwable cause){
        super(message, cause);
    }
    public KeyHoleSizeExeption(Throwable cause){
        super(cause);
    }
}
