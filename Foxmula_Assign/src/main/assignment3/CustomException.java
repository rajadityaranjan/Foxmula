package assignment3;

public class CustomException {
    void process(int n)
    {
        int b=0;
        try
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    b++;
            }

            if(b==2 && n%2==1)
            {
                throw new ArithmeticException("Invalid Number");
            }
            else
            {
                System.out.println("No exception found");
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
