package family;

public class Driver {
    public static void main(String[] args) {
        new Apo();
        System.out.println("Now calling a 1-param constructor");
        new Apo("Some greeting");
    }
}
