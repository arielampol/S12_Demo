package unicorn;

import java.util.Objects;

public class Unicorn {
    private String name;
    private int height;
    private int hornLength;
    private int weight;

    @Override
    /**
     * Override equals()
     * If the other Unicorn object has the same height, weight
     * hornlength, and name, then it's the same Unicorn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unicorn unicorn = (Unicorn) o;
        return height == unicorn.height && hornLength == unicorn.hornLength && weight == unicorn.weight && Objects.equals(name, unicorn.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, hornLength, weight);
    }

    public Unicorn(String name, int height, int hornLength, int weight) {
        this.name = name;
        this.height = height;
        this.hornLength = hornLength;
        this.weight = weight;
    }

    public Unicorn() {
        new Unicorn("Default name");
    }

    public Unicorn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHornLength() {
        return hornLength;
    }

    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
