import java.util.HashSet;
import java.util.LinkedHashSet;

public class PersonMain
{
    public static void main(String[] args) {

        LinkedHashSet<Person> hs=new LinkedHashSet<Person>();
        hs.add(new Person("Alice",30));
        hs.add(new Person("Bob",25));
        hs.add(new Person("Chandu",22));
        hs.add(new Person("Jenny",20));

        for(Person p : hs) {
            if (p.equals(new Person("Alice", 30)))
            {
                System.out.println("Is present");
                break;
            }
            else
                System.out.println("Not Present");
        }
    }
}
