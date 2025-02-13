
/**
 * Write a description of class Onetime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Onetime extends Appointment
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Onetime
     */
    public Onetime(String description, Date date)
    {
        // initialise instance variables
        super(description, date);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean occursOn(Date date)
    {
        //System.out.println(date);
        //System.out.println(this.date);
        if (this.date.equals(date)) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }   
    }
}
