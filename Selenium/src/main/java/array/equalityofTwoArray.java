package array;

import java.util.Arrays;

public class equalityofTwoArray {

    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};

        /***by using .equals() method***/

       /* if(Arrays.equals(a,b))
        {
            System.out.println("arrays are equal");
        }*/

        /****by using for loop ***/

        boolean hasEqual=false;
        if(a.length==b.length)
        {
         for(int i=0; i<a.length; i++)
         {
             if(a[i]==b[i])
             {
                 hasEqual=true;
             }
             else {
                 hasEqual=false;
             }
         }
        }
        else
        {
           hasEqual=false;
        }

        System.out.println(hasEqual);
    }
}
