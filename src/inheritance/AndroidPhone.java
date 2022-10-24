package inheritance;

public class AndroidPhone extends SmartPhone {
    public void charge(Charger charger) {
    if(charger == Charger.USB_A || charger == Charger.USB_C)
        super.charge(charger);
    else
        System.out.println("That's not an Android charger!");
}
}
