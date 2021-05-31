package assignment2;
import java.util.*;
public class chckset {
    Set<Integer> set = new HashSet<Integer>();

    public chckset(int s1, int s2, int s3, int s4, int s5)
    {
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
    }

    void check(int s)
    {
        System.out.println("The element " + s + " is present in set or not? " + set.contains(s));
    }
}
