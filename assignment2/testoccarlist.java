package assignment2;
import java.util.Scanner;
public class testoccarlist {
    public static void main(String args[])
    {

        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int n7 = sc.nextInt();
        int n8 = sc.nextInt();
        int n9 = sc.nextInt();

        occarrlist t = new occarrlist(n1,n2,n3,n4,n5,n6,n7,n8,n9);

        t.frequency();

        sc.close();

    }
}
