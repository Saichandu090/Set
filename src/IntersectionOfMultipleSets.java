import java.util.HashSet;
import java.util.Set;

public class IntersectionOfMultipleSets
{
    public static void main(String[] args) {

        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<Integer> s2=new HashSet<>();
        s2.add(2);
        s2.add(3);
        s2.add(4);

        Set<Integer> s3=new HashSet<>();
        s3.add(3);
        s3.add(4);
        s3.add(5);

        System.out.println("Intersection of every set is :");
        getIntersection(s1,s2,s3);
    }

    public static void getIntersection(Set<Integer> s1,Set<Integer> s2,Set<Integer> s3)
    {
        for(int i1 : s1)
        {
            for(int i2 : s2)
            {
                for(int i3 : s3)
                {
                    if(i1 == (i2 = i3))
                    {
                        System.out.println(i1);
                    }
                }
            }
        }
    }
}
