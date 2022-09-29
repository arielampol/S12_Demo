package hellophone;

import java.util.Objects;

public class Phone {
    private int length;
    private int height;
    private int thickness;
    private String os = "Generic OS";
    private String processor = "Generic Processor";

    private int number = Integer.parseInt("12345");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getOs(), phone.getOs()) && Objects.equals(getProcessor(), phone.getProcessor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOs(), getProcessor());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Phone(int length, int height, int thickness, String os, String processor) {
        this.length = length;
        this.height = height;
        this.thickness = thickness;
        this.os = os;
        this.processor = processor;
    }

    public Phone(String os, String processor) {
        this.os = os;
        this.processor = processor;
    }

    public static Phone createPhone() {
        return new Phone();
    }

    public static Phone createPhone(String os, String processor) {
        return new Phone(os, processor);
    }

    public Phone() {
        this.os = "Default OS";
        this.processor = "Generic ARM Processor";
    }

    @Override
    public String toString() {
        return "hellophone.Phone{" +
                "length=" + length +
                ", height=" + height +
                ", thickness=" + thickness +
                ", os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public void turnOn() {
        //TODO what happens when you turn on a phone
        System.out.println("hellophone.Hello. I'm a " + this.os + " hone.");
        initFileSystem();
    }

    private void initFileSystem() {
        //TODO do what happens when you initialize FS
    }

    public void turnOff() {
        System.out.println("Goodbye");
    }

    public String getOs() {
        return os;
    }

    public void upgradeOS() {
        //TODO code that upgrades the OS
        //this.os = this.os + 1 version
    }

    public void setOs(String os) throws Exception {
        if( os.startsWith("Android") || os.startsWith("iOS") )
            this.os = os;
        else {
            System.out.println("Not a valid OS!");
            throw new Exception("Not a valid OS!");
        }
    }

    public Phone returnThisPhone() {
        return this;
    }


}

