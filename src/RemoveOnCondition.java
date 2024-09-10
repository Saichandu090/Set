import java.util.Set;
import java.util.TreeSet;

public class RemoveOnCondition
{
    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);

        TreeSet<Integer> t1=condition(ts,3);
        for(int i : t1)
        {
            System.out.println(i);
        }
    }

    public static TreeSet<Integer> condition(TreeSet<Integer> s,int con)
    {
        TreeSet<Integer> ts=new TreeSet<>(s);
        for(int i : ts)
        {
            if(i<con)
                ts.remove(i);
        }
        return ts;
    }
}
