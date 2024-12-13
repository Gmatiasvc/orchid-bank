package common.exceptions;

public class DataMissmatch extends Exception {

    public DataMissmatch() {
        super("Data missmatch occurred during an operation, it aborted");
    }
}
