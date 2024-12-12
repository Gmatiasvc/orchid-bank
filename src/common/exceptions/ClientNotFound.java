package common.exceptions;

public class ClientNotFound extends Exception{
    public ClientNotFound(){
        super("Client not found in the database");
    }
}
