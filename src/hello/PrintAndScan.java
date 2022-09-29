package hello;

import hellophone.Phone;

import java.util.Scanner;


/**
 * This is the Print class. It just has a main()
 * @author Ariel Ampol
 * @version 1.0.0
 * @since 1.0.0
 */
public class PrintAndScan {
    /**
     * This is the main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Phone somePhone = new Phone();

//        System.out.println("There is a tab between this\t\tand the next word");
//        System.out.println("This is a composed string ending in the int " + 35*3);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input a string");
//        String input = sc.nextLine();
//        System.out.println("Please input a real number");
//        double number = sc.nextDouble();
//
//        System.out.println("You have entered: " + input);
//        System.out.printf("You have entered the number: %f\n", number);
//
//        sc.close();
//
//        sc = new Scanner(System.in);

        String newString = new String("I'm a string");
        newString = new String("Hey");
        String hey = new String("Hey");
        hey = "Hey";
        if( newString == hey ) {
            System.out.println("They're the same!");
            System.out.println("But not always; only due to String interning");
        }
        System.out.println(newString);

        int integer = Integer.parseInt("123");
        Integer intAsObject = Integer.parseInt("345");
        Integer newInteger = 45;
        int sum = integer + newInteger;

        boolean bool = true;
        boolean bool2 = false;
        Boolean boolAsObject = Boolean.TRUE;
    }

    /**
     * This just does nothing
     */
    public static void doNothing() {

    }

    /**
     * This is just a sample InnerClass
     */
    private class InnerClass {
        int someData;
    }
}
