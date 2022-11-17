package practicalinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Driver to show that Date, which implements Comparable, can be sorted by Collections.sort()
 */
public class SortingDates {
    public static void main(String[] args) {
        List<Date> dates = new LinkedList<>();

        dates.add(new Date(2022, 11, 17));
        dates.add(new Date(2002, 8, 24));
        dates.add(new Date(2002, 11, 17));
        dates.add(new Date(1999, 11, 18));
        dates.add(new Date(1993, 5, 4));
        dates.add(new Date(500, 7, 20));
        dates.add(new Date(1346, 10, 5));
        dates.add(new Date(1346, 10, 6));

        System.out.println("Unsorted dates:");
        for (Date d: dates) {
            System.out.println(d);
        }

        Collections.sort(dates);

        System.out.println("Sorted dates:");
        for (Date d: dates) {
            System.out.println(d);
        }
    }
}
