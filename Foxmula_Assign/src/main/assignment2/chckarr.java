package assignment2;
import java.util.ArrayList;
public class chckarr {
    java.util.List<Integer> aL = new ArrayList<Integer>();

    public chckarr(int s1, int s2, int s3, int s4, int s5)
    {
        aL.add(s1);
        aL.add(s2);
        aL.add(s3);
        aL.add(s4);
        aL.add(s5);
    }

    void check(int s)
    {
        System.out.println("The element " + s + " in ArrayList is present or not? " + aL.contains(s));
    }
}
