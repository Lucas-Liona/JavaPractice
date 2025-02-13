
/**
 * Write a description of class Monthly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monthly extends Appointment
{

    /**
     * Constructor for objects of class Monthly
     */
    public Monthly(String description, Date date)
    {
        // initialise instance variables
        super(description, date);
    }

    public boolean occursOn(Date date)
    {
        if (this.date.day == date.day) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }   
    }
}
