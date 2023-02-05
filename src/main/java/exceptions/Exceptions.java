package exceptions;

public class Exceptions extends AssertionError {

    private static final long serialVersionUID = 1L;

    public Exceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
