package common.exceptions;

public class InvalidInput extends Exception {

    public InvalidInput() {
        super("The inputted data to the method was deem invalid in the internal checks");
    }
}
