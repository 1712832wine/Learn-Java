public class MyDate {
    /**
     * MyDate
     */
    private Byte day;
    private Byte month;
    private Short year;

    public MyDate(int day, int month, int year) {
        super();
        if (day > 0 && day < 32)
            this.day = (byte) day;
        if (month > 0 && month < 13)
            this.month = (byte) month;
        if (year > 0)
            this.year = (short) year;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }

    // @Override
    public void setDay(Byte day) {
        this.day = day;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public void setYear(Short year) {
        this.year = year;
    }
    // public String toString() {
    // // TODO Auto-generated method stub
    // return this.day + "/" + this.month + "/" + this.year;
    // }

}
