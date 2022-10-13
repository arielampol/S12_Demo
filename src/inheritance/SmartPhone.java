package inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class SmartPhone extends Phone {
    private String os;
    private String appStore;
    private String currentRingTone;

    public void touch(int x, int y) {

    }

    public void openApp(String appName) {

    }

    public void useSmartAssistant() {

    }

    @Override
    public void ring() {
        System.out.println(currentRingTone + " "  + currentRingTone);
    }
}
