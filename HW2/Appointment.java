
/**
 * Write a description of class Appointment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//import java.lang.String;

public class Appointment
{
    // instance variables - replace the example below with your own
    public String description;
    public Date date;

    /**
     * Constructor for objects of class Appointment
     */
    public Appointment(String description, Date date)
    {
        this.description = description;
        this.date = date;
        
        System.out.println("New Appointment Created: " + description + " on " + date);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean occursOn(Date date)
    {
        //Overide this class
        System.out.println("This is an appointment with date " + this.date + " but no occurance interval, please do not use the Appointment superclass, use Onetime, Daily, or Monthly");
        return false;
    }
    
    public String toString()
    {
        return date + ". " + description;
    }
}
