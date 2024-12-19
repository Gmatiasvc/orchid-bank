package common.exceptions;

public class InsufficientFunds extends Exception {

    public InsufficientFunds() {
        super("The funds of the account were insufficient to perform the operation");
    }
}
