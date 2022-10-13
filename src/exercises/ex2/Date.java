package exercises.ex2;

import java.util.StringTokenizer;

public class Date {
    private int day, month, year;

    public Date(int year, int month, int day) {
        if( isValidDate(year, month, day) ) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            this.day = 19;
            this.month = 9;
            this.year = 2022;
        }
    }

    public Date(int month, int day) {
        this(2022, month, day);
    }

    public Date() {
        this(2022, 9, 19);
    }

    public Date getDate() {
        return this;
    }

    public void setDate(String date) {
        StringTokenizer tokens = new StringTokenizer(date, "-");
        int year, month, day;

        try {
            year = Integer.parseInt(tokens.nextToken());
            month = Integer.parseInt(tokens.nextToken());
            day = Integer.parseInt(tokens.nextToken());
        }
        catch (Exception e) {
            return;
        }

        if( tokens.hasMoreTokens() ) {
            // see if there are more tokens
            // because if there are, then string is invalid
            return;
        }
        else if( isValidDate(year,month,day) ) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if( year < 0 || year > 9999 ) {
            return false;
        }

        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day <= 31 && day > 0;
            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                return day <= 30 && day > 0;
            // February
            case 2:
                if( isLeapYear(year) ) {
                    return day <= 29 && day > 0;
                } else {
                    return day <= 28 && day > 0;
                }
            default:
                return false;
        }
    }

    private boolean validateSelf() {
        if( year < 0 || year > 9999 ) {
            return false;
        }

        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day <= 31 && day > 0;
            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                return day <= 30 && day > 0;
            // February
            case 2:
                if( isLeapYear(year) ) {
                    return day <= 29 && day > 0;
                } else {
                    return day <= 28 && day > 0;
                }
            default:
                return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0);
    }
}
