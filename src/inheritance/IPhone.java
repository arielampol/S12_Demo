package inheritance;

public class IPhone extends SmartPhone {
    private String iCloudAccount;

    public void useSiri() {

    }

    protected void dialSubMethod() {
        super.dialSubMethod();
    }

    public void iMessage() {

    }

    @Override
    public void charge(Charger charger) {
        if(charger == Charger.LIGHTNING)
            super.charge(charger);
        else
            System.out.println("That's not an iPhone charger!");
    }
}
