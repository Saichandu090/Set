import java.util.*;

public class FirstNonDuplicateElement
{
    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<Integer>();
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(5);
        l.add(6);

        Collections.sort(l);
        int rs=getFirstDup(l);
        System.out.println("First Non-Repeatable Element : "+ rs);
    }

    public static int getFirstDup(List<Integer> l)
    {
        System.out.println(l);
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>(l);
        System.out.println(lhs);
        int i=-1;
        for(int k : lhs)
        {
            i++;
            if (l.get(i) != k)
                return l.get(i-1);
        }
        return -1;
    }
}
