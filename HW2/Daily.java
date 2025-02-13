
/**
 * Write a description of class Daily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Daily extends Appointment
{
    // instance variables - replace the example below with your ow

    /**
     * Constructor for objects of class Daily
     */
    public Daily(String description)
    {
        // initialise instance variables
        super(description, new Date(0,0,0));
    }

    public boolean occursOn(Date date)
    {
        //System.out.println("true");
        return true;
    }
    
    public String toString()
    {
        return "Every Day " + description;
    }
}
