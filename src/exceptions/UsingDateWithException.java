package exceptions;

public class UsingDateWithException {
    public static void main(String[] args) {
        Date myDate = new Date();
        try {
            myDate.setDate("invalid");
        } catch (DateException de) {
            System.out.println(de);
        }
    }
}
