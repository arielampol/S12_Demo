import java.util.Scanner;
public class array1D {
    private int nCols;

    public array1D() {
    }

    public int getCols(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Columns: ");
        this.nCols = sc.nextInt();
        return nCols;
    }
    public String[] createArray(){
        String[] Array = {};
        Array = new String[this.nCols];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < this.nCols; i++){
            System.out.println("Enter Data: ");
            Array[i] = sc.nextLine();
        }
        return Array;
    }
}
