package unicorn;

import java.util.Arrays;
import java.util.List;

public class UnicornDriver {
    public static void main(String[] args) {
        Unicorn myFirstUnicorn = new Unicorn();

        System.out.println("The weight of myFirstUnicorn is " + myFirstUnicorn.getWeight());
        System.out.println("The name of myFirstUnicorn is " + myFirstUnicorn.getName());

        myFirstUnicorn.setName("Alpha");

        System.out.println("Now myFirstUnicorn's name is " + myFirstUnicorn.getName());

        Unicorn mySecondUnicorn = new Unicorn();
        System.out.println("There are " + Unicorn.getAllUnicornsCount() + " unicorns in this app");

        List<String> argsAsList = Arrays.asList(args);
    }
}
