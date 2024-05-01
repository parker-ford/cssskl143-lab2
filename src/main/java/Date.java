public class Date {
    private int month;
    private int day;
    private int year;

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void report() {
        System.out.println(month + "/" + day + "/" + year);
    }
}