package common.exceptions;

public class AccountNotFound extends Exception {

    public AccountNotFound() {
        super("Account not found in the database");
    }
}
