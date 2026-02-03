package integers;

import java.util.Scanner;

public class checkIfGivenNumberIsArmstrong {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int sameA=a;

        int size=String.valueOf(a).length();

        int armstrongNumber=0;

       while(a!=0)
       {
           int b=a%10;            //to take the last value
           int digitPower=1;
           for(int i=0; i<size; i++)
           {
               digitPower = digitPower * b;                       //to multiply the last value as per the size of int
           }

           armstrongNumber = armstrongNumber + digitPower;

           a=a/10;
       }

        System.out.println(armstrongNumber);


       if(sameA==armstrongNumber)
       {
           System.out.println(sameA+" Number is armstrong");
       }
       else {
           System.out.println(sameA+" Number is  not armstrong");
       }


    }
}
