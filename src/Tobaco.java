public class Tobaco extends Addiction implements SubstanceAbuse 
{
    public Tobaco()
    {
        super("Tobaco", "Place Holder Description", "Place holder symptoms");
    }

    // Need to figure out where we want to go with testing blood
    public boolean testBlood()
    {
        return true;
    }

    // Should we create a list of advisable things that get pushed out to the user randomly?
    public void giveAdvice()
    {
        System.out.println("You should try chewing gum");
    }
}
