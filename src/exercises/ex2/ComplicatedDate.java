package exercises.ex2;

/**
 * A demo of composition
 * The "part-of" class doesn't have to be an inner class
 * It just happened to be one in this example
 */
public class ComplicatedDate {
    private MonthDayTuple mdTuple;
    private int year;

//    public ComplicatedDate() {
//        year = 2022;
//        mdTuple = new MonthDayTuple(10, 3);
//    }

//    public ComplicatedDate(MonthDayTuple mdTuple, int year) {
//        this.mdTuple = mdTuple;
//        this.year = year;
//    }

    public ComplicatedDate(int year, int month, int day) {
        this.year = year;
        this.mdTuple = new MonthDayTuple(month, day);
        // Now that's composition!
    }

    private class MonthDayTuple {
        private int month;
        private int day;

        public MonthDayTuple(int month, int day) {
            this.month = month;
            this.day = day;
        }
    }
}
