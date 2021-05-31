package assignment2;
import java.util.Scanner;
public class testtravHash {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        travHash  t = new travHash(s1,s2,s3,s4,s5);

        t.traverse();

        sc.close();

    }

}
