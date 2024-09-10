import java.time.LocalTime;
import java.util.*;

public class Performance
{
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        //getHashSet(hs); //It took 4 milli-seconds
        System.out.println("================");
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        //getHashSet(lhs); //It took less than 1 milli-second
        System.out.println("================");
        TreeSet<Integer> ts=new TreeSet<>();
        getHashSet(ts); //It took 4 milli-seconds
    }

    public static void getHashSet(Set<Integer> s)
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println(s.add(i)+""+LocalTime.now());
        }
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.remove(i)+" "+LocalTime.now());
        }
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.contains(i)+" "+LocalTime.now());
        }
    }
}
