package exceptions;

public class DateException extends Exception {
    public DateException() {
        super("That's date exception!");
    }

    public DateException(String msg) {
        super(msg);
    }
}
