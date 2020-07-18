public class Date{
	private int year;
	private int month;
    private int day;
    public Date() {
        this(2017,1,1);
    }
    public Date(int yy) {
        this(yy,1,1);
    }
    public Date(int yy,int mm){
    	this (yy,mm,1);
    }
    public Date(int yy,int mm, int dd) {
    setYear(yy);
	setMonth(mm);
	setDay(dd);
    }
    public void setYear(int yy) {
    	year = yy;
    }
    public void setMonth(int mm) {
		if(mm >= 1 && mm <= 12) month = mm;
		else month = 1;
    }
    public void setDay(int dd) {
		if(dd >= 1 && dd <= 31) day= dd;
		else day= 1;
    }
    @Override
    public String toString() {
		return String.format("%04d/%02d/%02d",year, month, day);
    }
}