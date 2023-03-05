import java.util.Set;

/**
 * This class models a Patient 
 * @author Sean Twomey
 */

public class Patient 
{
    private Set<Addiction> addictions;
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void addAddiction(Addiction addiction)
    {
        addictions.add(addiction);
    }

    public void removeAddiction(Addiction addiction)
    {
        addictions.remove(addiction);
    }

    public Addiction retrieveAddiction(String addictionName)
    {
        for(Addiction addiction: addictions)
        {
            if(addictionName.getClass().getSimpleName().equalsIgnoreCase(addictionName)) {
                // an addiction was found that matches the name input
                return addiction;
            }
        }
        // no addiction was found that matches the name input
        return null;
    }
        
}
