package assignment3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner (System.in);

        while(true) {
            System.out.println("1.SimpleFrequency  \t2.CustomException \t3.SortedFrequency");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Answer 1
                    int arr[] = {10, 20, 10, 10, 20, 5, 5, 5, 5, 5, 5, 5};
                    int size = arr.length;
                    SimpleFreq O1 = new SimpleFreq();
                    System.out.print("\n" + "\n" + "\n Array is: ");
                    for(int i=0;i<size;i++){
                        System.out.print(" "+arr[i]);
                    }
                    System.out.println("\n");
                    O1.countFreq(arr, size);
                    break;
                case 2:
                    // Answer 2
                    System.out.print("Enter a number : ");
                    int n = scanner.nextInt();
                    CustomException O2 = new CustomException();
                    O2.process(n);
                    break;
                case 3:
                    // Answer 3
                    int arr1[] = {10,20,10,10,6,6,6,6,6,24,24,24,20,5,5,5,5,5,5,5};
                    int size1 = arr1.length;
                    SortFreq O3 = new SortFreq();
                    System.out.println("\n"+"\n"+"\n");
                    O3.Frequency(arr1);


                default:
                    System.exit(0);
            }

        }
    }
}
