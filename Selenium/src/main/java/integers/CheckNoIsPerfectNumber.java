package integers;

import java.util.Scanner;

public class CheckNoIsPerfectNumber {

    /**Divisors of 6: 1, 2, 3, 6

     Proper divisors: 1 + 2 + 3 = 6

     Since the sum of its proper divisors is equal to the number itself, 6 is a perfect number.  **/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        int sum=0;
        for(int i=1; i<=input; i++)
        {

            if(i!=input)
            {
                if (input % i == 0)
                {
                    System.out.print(i+" ");
                    sum=sum+i;
                }
            }
        }


        System.out.println("\naddition of all above number is "+ sum);

        if (input ==sum)
        {
            System.out.println(input +" is perfect number");
        }
        else
        {
            System.out.println(input +" is not perfect number");
        }
    }
}
