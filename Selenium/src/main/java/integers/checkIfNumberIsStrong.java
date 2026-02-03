package integers;

import java.util.Scanner;

public class checkIfNumberIsStrong {

    /***Sum of factorial of all digit should be equal to given number
     * if number=123; then 1!+2!+3!=123
     *
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        int copyInput=input;

        int sum=0;
        while (input!=0)
        {
            int digit=input%10;
            int startNum=1;
            for(int i=1; i<=digit; i++)
            {
                startNum=startNum*i;
            }

            sum=sum+startNum;

            input=input/10;
        }

        System.out.println("Sum of all factorial is:" +sum);

        if (copyInput==sum)
        {
            System.out.println(copyInput+" Number is Strong");
        }
        else {
            System.out.println(copyInput+" number is not strong");
        }
    }
}
