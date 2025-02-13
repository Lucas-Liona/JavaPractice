
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    // instance variables - replace the example below with your own
    public int day;
    public int month;
    public int year;
    
    /**
     * Constructor for objects of class Date
     */
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Date getDate()
    {
        return this;
    }
    
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString()
    {
        return this.day + "/" + this.month + "/" + this.year;
    }
    
    public boolean equals(Date date)
    {
        if (this.day == date.day && this.month == date.month && this.year == date.year)
        {
            return true;
        } else {
            return false;
        }
    }
}
