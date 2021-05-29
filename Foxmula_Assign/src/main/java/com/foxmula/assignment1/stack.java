package com.foxmula.assignment1;

import java.util.*;

class stack{
     public Stack<Integer> st=new Stack<Integer>();

     public void push(int n)
     {
            this.st.push(n);
     }
     
     public void pop()
     {
            this.st.pop();
     }

     public void check_empty()
     {
            if(this.st.empty())
            {
                System.out.println("Stack is empty");
            }
            else
            {
                System.out.println("Stack is not empty");
            }
     }
}
