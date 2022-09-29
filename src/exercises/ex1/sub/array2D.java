public class array2D {
    private int nRows;

    public array2D(int nRows) {
        this.nRows = nRows;
    }

    public String[][] create2DArray(){
        array1D a1 = new array1D();

        String[][] array2D ={};
        array2D = new String[this.nRows][];
        for(int i = 0; i < this.nRows; i++){
            a1.getCols();
            array2D[i] = a1.createArray();
        }
        return array2D;
    }
    public void displayArray(String[][] arr){
        System.out.println("Output Array:\n");
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                System.out.printf("[%s]", arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
