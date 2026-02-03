package integers;

import java.util.Scanner;

public class findIfNumberIsPrime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        boolean isNoPrime=false;

        int count=0;
        if(input>1)
        {
            for(int i=1; i<=input; i++)
            {
               if(input%i==0)
               {
                   count++;
               }
            }
            if (count==2)
            {
                isNoPrime=true;
            }
            if(isNoPrime)
            {
                System.out.println(input+" is prime");
            }
            else
            {
                System.out.println(input+" is not prime");
            }
        }


}}

