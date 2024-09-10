import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> h1=new HashSet<>();
        h1.add(98);
        h1.add(63);
        h1.add(23);

        HashSet<Integer> h2=new HashSet<>();
        h2.add(98);
        h2.add(23);
        h2.add(45);
        h2.add(63);

        System.out.println(h2.containsAll(h1));
        System.out.println(h1.containsAll(h2));

        System.out.println("================");

        LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
        lh1.add(78);
        lh1.add(63);
        lh1.add(25);

        LinkedHashSet<Integer> lh2=new LinkedHashSet<>();
        lh2.add(78);
        lh2.add(63);
        lh2.add(85);
        lh2.add(25);

        System.out.println(lh2.containsAll(lh1));
        System.out.println(lh1.containsAll(lh2));

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(85);
        ts.add(10);
        ts.add(20);
        ts.add(30);

        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(10);
        ts1.add(20);
        ts1.add(58);
        ts1.add(30);
        ts1.add(85);

        System.out.println("=================");
        System.out.println(ts1.containsAll(ts));
        System.out.println(ts.containsAll(ts1));
    }
}
