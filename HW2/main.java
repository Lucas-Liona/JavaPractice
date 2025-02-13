
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //for user input

public class main
{
    // instance variables - replace the example below with your own
    public Appointment appointment;
    public Onetime onetime;
    public Monthly monthly;
    public Daily daily;
    
    public Appointment[] appointments;
    
    /**
     * Constructor for objects of class main
     */
    public main()
    {
        // initialise instance variables
        Date testDate = new Date(12, 2, 2025);
        Date alternateDate = new Date(2, 2, 2025);
        
        
        appointment = new Appointment("Visit Dentist", testDate);
        onetime = new Onetime("Jump around", testDate);
        monthly = new Monthly("Checkup", testDate);
        daily = new Daily("Eat Apple");
        
        
        appointment.occursOn(testDate); //
        onetime.occursOn(testDate); //true
        monthly.occursOn(testDate); //true
        daily.occursOn(testDate); //true
        monthly.occursOn(alternateDate); //false
        monthly.occursOn(new Date(12, 5, 2025)); //true
        onetime.occursOn(alternateDate); //false
    
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day, month, and year (e.g., 10 12 2024): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        
        Date userDate = new Date(day, month, year);
        
        appointments = new Appointment[] {onetime, monthly, daily, new Onetime("Play in the Snow", new Date(5, 7, 2025))};
        
        for (int i = 0; i < appointments.length; i++) {
            if(appointments[i].occursOn(userDate))
            {
                System.out.println("Appointment found: " + appointments[i]);
            }
        }
        scanner.close();
    }
}
