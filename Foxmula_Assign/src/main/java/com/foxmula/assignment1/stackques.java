package com.foxmula.assignment1;

import java.util.*;

public class stackques{
    public static void main(String []args) {
    
        stack s1=new stack();
        stack s2=new stack();
        Scanner obj=new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Stack 1 \n2. Stack 2");
            int choice=obj.nextInt();
            System.out.println("1. push \n2. pop \n3. Check empty");
            int operation=obj.nextInt();
            if(choice==1)
            {
                switch(operation)
                {
                    case 1:
                         int value=obj.nextInt();
                         s1.push(value);
                         break;
                    case 2:
                         s1.pop();
                         break;
                    default:
                         s1.check_empty();
                         break;
                }
            }
            else if(choice==2)
            {
                switch(operation)
                {
                    case 1:
                         int value=obj.nextInt();
                         s2.push(value);
                         break;
                    case 2:
                         s2.pop();
                         break;
                    default:
                         s2.check_empty();
                         break;
                }
            }
	    else{System.out.exit(0);}

            if(s1.st.size()==s2.st.size())
                System.out.println("\n\nBoth stacks are equal and size of the stack is= "+s2.st.size()+" ");
        }

    }
}
