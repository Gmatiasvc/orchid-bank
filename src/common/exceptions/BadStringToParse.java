package common.exceptions;

public class BadStringToParse extends Exception{
    public BadStringToParse(){
        super("String sent to parse is incomplete or corrupted");
    }
}