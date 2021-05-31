package assignment2;
import java.util.*;
public class travtreeset {
    TreeSet<Integer> ts = new TreeSet<Integer>();

    public travtreeset (int n1, int n2, int n3, int n4, int n5)
    {
        ts.add(n1);
        ts.add(n2);
        ts.add(n3);
        ts.add(n4);
        ts.add(n5);
    }

    void traverse()
    {

        Iterator<Integer> iterator = ts.iterator();
        System.out.println("TreeSet: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
