package hellophone;

public class Hello {
    public static void main(String[] args) throws Exception {
        String name = "Juanito";
        System.out.println("Hello World!");
        System.out.printf("Hello %s%d\n", name, 45);
        System.out.println("Hello " + name + '!');

        Phone arielsPhone = new Phone("Android 12", "Snapdragon Gen8");
        Phone mikesPhone = new Phone("iOS 13", "A13 Bionic");
        Phone verySpecificPhone = new Phone(5,4,1,"Android 11", "Mediatek 100");


        arielsPhone.turnOn();
        mikesPhone.turnOn();

        arielsPhone.setOs("Android 13");

        Phone genericPhone = new Phone();

        System.out.println(genericPhone);
        System.out.println(arielsPhone);
        System.out.println(mikesPhone);
        System.out.println(verySpecificPhone);
    }
}
