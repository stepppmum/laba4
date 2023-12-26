package Exeptions;

public class SameActionExeption extends RuntimeException{
    public SameActionExeption(String message){
        super(message);
    }
}
