package unicorn;

public class PassingExample {
    public static void main(String[] args) {
        int primitive = 10;
        Integer notPrimitive = 10;

        modifyInputs(primitive, notPrimitive);

        System.out.println("int is now " + primitive);
        System.out.println("Integer is now " + notPrimitive);
    }

    private static void modifyInputs(int i, Integer s) {
        i = i + 1;
        s = s + 1;
    }
}
