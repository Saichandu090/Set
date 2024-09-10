import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class FirstNonDuplicateElement
{
    public static void main(String[] args) {

        List<Integer> l=new ArrayList<Integer>();
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(5);

        int rs=getFirstDup(l);
        System.out.println(rs);
    }

    public static int getFirstDup(List<Integer> l)
    {
        LinkedHashSet<Integer> lh=new LinkedHashSet<>(l);
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<lh.size();i++)
        {
            if(lh.contains(l.get(i)))
                h.add(l.get(i));
            else
                return l.get(i);
        }
        return -1;
    }
}
