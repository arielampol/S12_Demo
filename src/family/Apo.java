package family;

public class Apo extends Son {
    public Apo() {
        super();
        System.out.println("Instantiated an Apo");
    }

    public Apo(String greeting) {
        //super(greeting);
        super(1,2);
        // if you don't call the parent's 1-param constructor or any other constructor,
        // the empty constructor will automatically be implicitly called before the line below
        System.out.println(greeting);
    }
}
