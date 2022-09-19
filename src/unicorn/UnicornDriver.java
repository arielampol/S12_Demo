package unicorn;

public class UnicornDriver {
    public static void main(String[] args) {
        Unicorn myFirstUnicorn = new Unicorn();

        System.out.println("The weight of myFirstUnicorn is " + myFirstUnicorn.getWeight());
        System.out.println("The name of myFirstUnicorn is " + myFirstUnicorn.getName());

        myFirstUnicorn.setName("Alpha");

        System.out.println("Now myFirstUnicorn's name is " + myFirstUnicorn.getName());
    }
}
