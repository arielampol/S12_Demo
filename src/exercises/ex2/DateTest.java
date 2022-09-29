package exercises.ex2;

public class DateTest {
    public static void main(String[] args) {
        // Testing the base case of the 0-argument constructor
        Date date = new Date();
        String dateExpected1 = "2022-09-19";
        System.out.printf("TEST 1: Default case %s\n",
                        dateExpected1.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the 2-argument constructor
        date = new Date(8,11);
        String dateExpected2 = "2022-08-11";
        System.out.printf("TEST 2: 2-argument constructor case %s\n",
                        dateExpected2.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the 3-argument constructor
        date = new Date(2019, 10, 25);
        String dateExpected3 = "2019-10-25";
        System.out.printf("TEST 3: 3-argument constructor case %s\n",
                        dateExpected3.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the invalid setDate() due to it not being a leap year
        date.setDate("1990-02-29");
        String dateExpected4 = "2019-10-25";
        System.out.printf("TEST 4: invalid setDate() case %s\n",
                        dateExpected4.equals(date.toString()) ? "PASSED" : "FAILED");

        // CUTOFF of sample

        // Testing the case of a valid setDate()
        date.setDate("2015-02-28");
        String dateExpected5 = "2015-02-28";
        System.out.printf("TEST 5: valid setDate() case %s\n",
                        dateExpected5.equals(date.toString()) ? "PASSED" : "FAILED");


        // Testing the case of the invalid setDate() due to string format 1
        date.setDate("A2015-02-28");
        String dateExpected6 = "2015-02-28";
        System.out.printf("TEST 6: invalid setDate() case %s\n",
                        dateExpected6.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the invalid setDate() due to string format 2
        date.setDate("2015-02-287");
        String dateExpected7 = "2015-02-28";
        System.out.printf("TEST 7: invalid setDate() case %s\n",
                        dateExpected7.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the valid setDate() with year < 1000
        date.setDate("0010-01-01");
        String dateExpected8 = "0010-01-01";
        System.out.printf("TEST 8: valid setDate() with year < 1000 case %s\n",
                        dateExpected8.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of the invalid 3-argument constructor
        date = new Date(-1, 13, 32);
        String dateExpected9 = "2022-09-19";
        System.out.printf("TEST 9: invalid 3-argument constructor case %s\n",
                        dateExpected9.equals(date.toString()) ? "PASSED" : "FAILED");

        // Testing the case of using getDate()
        Date date2 = date.getDate();
        System.out.printf("TEST 10: implementation of getDate() %s\n",
                        date == date2 ? "PASSED" : "FAILED");
    }
}
