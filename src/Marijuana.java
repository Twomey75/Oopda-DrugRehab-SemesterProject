public class Marijuana extends Addiction implements SubstanceAbuse {
    
    private float bac;

    public Marijuana(float bac)
    {
        super("Marijuana", "Place Holder Description", "Place holder symptoms");
        this.bac = bac;
    }

    // Need to figure out where we want to go with testing blood
    public boolean testBlood()
    {
        return true;
    }

    // Should we create a list of advisable things for each addiction that get pushed out to the user randomly when running this method?
    public void giveAdvice()
    {
        System.out.println("You should have hung around a better crowd in highschool");
    }
}