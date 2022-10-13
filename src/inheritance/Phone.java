package inheritance;

public class Phone {
    private Screen screen;
    private String name;
    private int batteryCapacity = 50;
    private int length;
    private int height;
    private int thickness;

    Object obj = new Object();

    public void dial(long phoneNumber) {
        dialSubMethod();
    }

    protected void dialSubMethod() {
        System.out.println("This is something Phone does when dial() is called");
    }

    public void ring() {
        System.out.println("Ring ring");
    }

    public void charge(Charger charger) {
        batteryCapacity += 10;
    }

}
