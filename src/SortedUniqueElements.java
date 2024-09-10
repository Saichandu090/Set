import java.util.*;

public class SortedUniqueElements
{
    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<Integer>();
        l.add(7);
        l.add(2);
        l.add(9);
        l.add(1);
        l.add(2);
        l.add(9);

        Set<Integer> s=getAsc(l);
        for (Integer i : s)
        {
            System.out.print(i+" ");
        }
    }

    public static TreeSet<Integer> getAsc(List<Integer> l)
    {
        TreeSet<Integer> t=new TreeSet<Integer>(l);
        return t;
    }
}
