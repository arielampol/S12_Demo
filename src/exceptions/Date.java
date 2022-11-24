package exceptions;


import java.io.Serializable;
import java.util.Objects;
import java.util.StringTokenizer;

public class Date implements Comparable<Date>, Serializable {
    int day, month, year;

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

    public void setDate(String date) throws DateException {
        StringTokenizer tokens = new StringTokenizer(date, "-");
        int year, month, day;

        try {
            year = Integer.parseInt(tokens.nextToken());
            month = Integer.parseInt(tokens.nextToken());
            day = Integer.parseInt(tokens.nextToken());
        }
        catch (Exception e) {
            throw new DateException("Can't parse it!");
        }

        if( tokens.hasMoreTokens() ) {
            // see if there are more tokens
            // because if there are, then string is invalid
            throw new DateException("There was a valid date, but some unexpected value as well!");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public int compareTo(Date o) {
        if(this.year == o.year) {
            if(this.month == o.month) {
                return this.day - o.day;
            } else {
                return this.month - o.month;
            }
        } else {
            return this.year - o.year;
        }
    }
}
