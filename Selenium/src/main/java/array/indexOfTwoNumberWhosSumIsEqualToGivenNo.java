package array;

import java.util.Scanner;

public class indexOfTwoNumberWhosSumIsEqualToGivenNo {

    /***** Find the indices of two numbers whose sum is equal to a given input. ***/

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int inputNumber=sc.nextInt();
        int []ar={3,1,2,5,7,10,3,1};

        boolean isSumOk=false;
        for(int i=0; i<ar.length; i++)
        {
            for(int j=0; j<ar.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(ar[i]+ar[j]==inputNumber)
                {
                    System.out.println(i+" "+j);
                    isSumOk=true;
                    break;
                }
            }
            if(isSumOk)
            {
                break;
            }
        }

    }
}
