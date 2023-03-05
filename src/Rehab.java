import java.util.HashSet;

/**
 * this class takes care of managing rehab support groups
 * @author Sean Twomey
 */

public class Rehab 
{
        private HashSet<Patient> roster;
        private String groupName;
        private Addiction addictionType;

        public Rehab(String name, Addiction addictionType)
        {
            roster = new HashSet<Patient>();
            this.groupName = name;
            this.addictionType = addictionType;
        }

        public void addMember(Patient member)
        {
            roster.add(member);
        }

        public void removeMember(Patient member)
        {
            roster.remove(member);
        }
}
