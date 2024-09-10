import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBehavior
{
    public static void main(String[] args) {

        int[] ar={5,3,5,1,2,3,7,9,2,34};
        Set<Integer> hs=getHashSet(ar);
        for(int i : hs)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        Set<Integer> lhs=getLinkedHashSet(ar);
        for(int i : lhs)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        Set<Integer> ts=getTreeSet(ar);
        for(int i : ts)
        {
            System.out.print(i+" ");
        }
    }

    public static HashSet<Integer> getHashSet(int[] ar)
    {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            s.add(ar[i]);
        }
        return s;
    }

    public static LinkedHashSet<Integer> getLinkedHashSet(int[] ar)
    {
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            s.add(ar[i]);
        }
        return s;
    }

    public static TreeSet<Integer> getTreeSet(int[] ar)
    {
        TreeSet<Integer> s=new TreeSet<>();
        for(int i=0;i<ar.length;i++)
        {
            s.add(ar[i]);
        }
        return s;
    }
}
