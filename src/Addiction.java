/**
 * This class models some basic info about a type of addiction the user can have
 * @author Sean Twomey
 */

public class Addiction 
{
    private String name;
    private String description;
    private String symptoms;
    private int daysWithoutRelapse;

    public Addiction(String name, String description, String symptoms, int daysWithoutRelapse)
    {
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.daysWithoutRelapse = daysWithoutRelapse;
    }

    public void relapse()
    {
        this.daysWithoutRelapse = 0;
    }

    public void checkIn(boolean hasRelapsed)
    {
        if(hasRelapsed){
            relapse();
        }
    }
}
