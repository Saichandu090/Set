import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonMain
{
    public static void main(String[] args) {

        Set<Person> hs=new LinkedHashSet<Person>();
        hs.add(new Person("Alice",30));
        hs.add(new Person("Bob",25));
        hs.add(new Person("Chandu",22));
        hs.add(new Person("Jenny",20));

        Set<Person> s=new HashSet<>();
        s.add(new Person("Alice",30));
        s.add(new Person("Chandu",22));
        s.add(new Person("Jenisha",19));
        s.add(new Person("Sowmya",24));

        System.out.println("Union : ");
        union(hs,s);
        System.out.println("==============");
        System.out.println("Difference : ");
        difference(hs,s);

        System.out.println("==============");
        check(new Person("Alice",30),hs);
    }

    public static void check(Person p,Set<Person> hs)
    {
        for(Person d : hs) {
            if (d.equals(p))
            {
                System.out.println("Is present");
                break;
            }
            else
                System.out.println("Not Present");
        }
    }


    public static void union(Set<Person> s1,Set<Person> s2)
    {
        Set<Person> s3=new LinkedHashSet<>(s1);
        s3.addAll(s2);
        for(Person p : s3)
        {
            System.out.println(p);
        }
    }

    public static void difference(Set<Person> s1,Set<Person> s2)
    {
        for(Person p : s1)
        {
            boolean rs=false;
            for(Person p1 : s2)
            {
                if(p.equals(p1))
                    rs=true;
            }
            if(!rs)
                System.out.println(p);
        }
    }
}
