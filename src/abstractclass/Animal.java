package abstractclass;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Huntable {
    public String name;
    protected static String someVar = "Default";

    abstract void makeNoise();
    public void die() {
        System.out.println("RIP friend");
    }

}
