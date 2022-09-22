package foreach;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        // For each loop
        for(int iter : arr) {
            System.out.println("The current element is " + iter);
        }

        // Traditional for loop with iterator
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The current element is " + arr[i]);
        }

        // Foreach + String.split()
        for(String current : "hello-hi-hola".split("-")) {
            System.out.println(current);
        }
    }
}
