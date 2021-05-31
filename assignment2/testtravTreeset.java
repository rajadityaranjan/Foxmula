package assignment2;
import java.util.Scanner;
public class testtravTreeset {
    public static void main(String args[])
    {

        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        travtreeset   t = new travtreeset(n1,n2,n3,n4,n5);

        //Traversing elements
        t.traverse();

        sc.close();

    }
}
