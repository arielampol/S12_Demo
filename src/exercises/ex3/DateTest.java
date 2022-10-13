package exercises.ex3;

public class DateTest {
    public static void main(String[] args) {
        // Testing the default constructor using toString2()
        Date date = new Date();
        String stringExpected1 = "September 19, 2022";
        System.out.printf("TEST 1: Default case using toString2() %s\n",
                stringExpected1.equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing setDate() with an invalid int, int, int using equals()
        date.setDate(12, 12, -1);
        Date dateExpected2 = new Date();
        System.out.printf("TEST 2: setDate() with an invalid int, int, int using equals() %s\n",
                dateExpected2.equals(date) ? "PASSED" : "FAILED");

        // Testing setDate() with an invalid int, int, int using toString2()
        date.setDate(-1, 12, 10);
        System.out.printf("TEST 3: setDate() with an invalid int, int, int using toString2() %s\n",
                dateExpected2.toString2().equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing the 3-argument constructor using toString2()
        date = new Date(1994, 8,11);
        String stringExpected4 = "August 11, 1994";
        System.out.printf("TEST 4: 3-argument constructor using toString2() %s\n",
                stringExpected4.equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing setDate() with a valid int, int, int using equals()
        date.setDate(12, 23, 100);
        Date dateExpected5 = new Date(100,12,23);
        System.out.printf("TEST 5: setDate() with a valid int, int, int using equals() %s\n",
                dateExpected5.equals(date) ? "PASSED" : "FAILED");

        // Testing setDate() with a valid int, int, int using toString2()
        String stringExpected6 = "December 23, 100";
        System.out.printf("TEST 6: setDate() with a valid int, int, int using toString2() %s\n",
                stringExpected6.equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing setDate() with a valid String, int, int using equals()
        date.setDate("January", 28, 2050);
        Date dateExpected7 = new Date(2050, 1, 28);
        System.out.printf("TEST 7: setDate() with a valid String, int, int using equals() %s\n",
                dateExpected7.equals(date) ? "PASSED" : "FAILED");

        // Testing setDate() with a valid String, int, int using toString2()
        String stringExpected8 = "January 28, 2050";
        System.out.printf("TEST 8: setDate() with a valid String, int, int using toString2() %s\n",
                stringExpected8.equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing setDate() with an invalid String, int, int using toString2()
        date.setDate("Marso", 5, 1970);
        System.out.printf("TEST 9: with an invalid String, int, int using toString2() %s\n",
                stringExpected8.equals(date.toString2()) ? "PASSED" : "FAILED");

        // Testing comparison with null using equals()
        Date nullDate = null;
        System.out.printf("TEST 10: test comparison with null using equals()  %s\n",
                dateExpected2.toString2().equals(nullDate) ? "FAILED" : "PASSED");
    }
}
