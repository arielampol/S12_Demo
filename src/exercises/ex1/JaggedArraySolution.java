package ex1;

import java.util.Scanner;

public class JaggedArraySolution {
    public static void main(String[] args)
    {
        Scanner stdinScanner = new Scanner(System.in);
        int rows;

        System.out.print("How many rows are there? ");
        rows = safeInsistentGetInt(stdinScanner);

        String[][] jaggedArray = new String[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.printf("How many columns does row %d have? ", i);
            jaggedArray[i] = new String[safeInsistentGetInt(stdinScanner)];
        }

        for (int o = 0; o < rows; o++) {
            for (int i = 0; i < jaggedArray[o].length; i++) {
                System.out.printf("What is the value of jaggedArray[%d][%d]? ", o, i);
                jaggedArray[o][i] = stdinScanner.nextLine();
            }
        }

        // This can be looped using foreach construct
        System.out.println("Here's your array");
        for (String[] strings : jaggedArray) {
            for (int i = 0; i < strings.length; i++) {
                System.out.printf("[%s] ", strings[i]);
            }
            System.out.println();
        }
    }

    /**
     * A function that insistently reads input
     * until it gets a non-negative integer
     * @param sc the Scanner to read from
     * @return the first non-negative integer from sc
     */
    private static int safeInsistentGetInt(Scanner sc) {
        int ret;

        while(true) {
            try {
                ret = Integer.parseInt(sc.nextLine());
                if(ret < 0)
                    throw new IllegalArgumentException();
                break;
            }
            catch (Exception e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }

        return ret;
    }
}
