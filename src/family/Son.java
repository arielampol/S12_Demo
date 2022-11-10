package family;

public class Son extends Papa {
    public Son() {
        super();
        System.out.println("Instantiated a Son");
    }

    public Son(String greeting) {
        // here exists an implied call to super()
        System.out.println("1-param constructor for Son");
        System.out.println(greeting);
    }

    public Son(int one, int two) {
        // here exists an implied call to super()
        System.out.println("2-param constructor for Son");
    }
}
