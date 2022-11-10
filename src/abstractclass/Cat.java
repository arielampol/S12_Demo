package abstractclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cat extends Animal {

    @Override
    void makeNoise() {
        System.out.println("Meow, I'm " + name);
    }

    @Override
    public void hunt() {
    }
}
