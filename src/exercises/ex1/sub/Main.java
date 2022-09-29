import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number of Rows: ");
        int nRows = sc.nextInt();

        array2D a2 = new array2D(nRows);

        a2.displayArray(a2.create2DArray());
        sc.close();
    }
}
