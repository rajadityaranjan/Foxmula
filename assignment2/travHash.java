package assignment2;
import java.util.*;
public class travHash {
    HashSet<Integer> set=new HashSet<Integer>();

    public travHash (int s1, int s2, int s3, int s4, int s5)
    {
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
    }

    void traverse()
    {
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
    }
}
