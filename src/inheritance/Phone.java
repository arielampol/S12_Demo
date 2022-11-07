package inheritance;

public class Phone {
    private Screen screen;
    private String name;
    protected int batteryCapacity = 50;
    private int length;
    private int height;
    private int thickness;

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
        if(batteryCapacity <= 80)
            batteryCapacity += 20;
        else
            batteryCapacity = 100;
    }

}
