package integers;

import java.util.Scanner;

public class swapNumbers {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



        /****1st logic using temp variable888**/

      /*
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);*/


        /***using +,- operator ***/
       /* a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);*/

        /**using /,* operator***/
     /* a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a);
        System.out.println(b);*/

        /***using bitwise operator**/
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);

    }
}