import java.util.*;

public class MaintainingInsertionOrder
{
    public static void main(String[] args) {

        List<String> l=new ArrayList<String>();
        l.add("Sai");
        l.add("Apple");
        l.add("Jenny");
        l.add("Apple");
        l.add("Cherry");
        l.add("Sai");
        l.add("Soul");

        LinkedHashSet<String> lhs=getLhs(l);
        for(String s : lhs)
        {
            System.out.println(s);
        }
    }

    public static LinkedHashSet<String> getLhs(List<String> l)
    {
        LinkedHashSet<String > lh=new LinkedHashSet<String>(l);
        return lh;
    }
}
