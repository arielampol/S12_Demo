package exceptions;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("One - outside try");
        try {
            int nVal = input.nextInt();
            System.out.println("Two - inside try");
            System.out.println("Input is : " + nVal);
        }
        catch (Exception a) {
            System.out.println("Three - inside catch");
            System.out.println(a.toString());
        }
        finally {
            System.out.println ("Four - inside finally");
        }

        System.out.println ("Five - outside finally");
    }
}
