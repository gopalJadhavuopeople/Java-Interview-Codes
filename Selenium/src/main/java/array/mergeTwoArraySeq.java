package array;

import java.util.Arrays;

public class mergeTwoArraySeq {

    public static void main(String[] args)
    {
        int ar1[]={1,3,5,7};
        int ar2[]={2,4,6,8};

        int size=ar1.length+ar2.length;

        int ar[]=new int[size];

        int i=0, j=0, k=0;

           while (i<ar1.length && j<ar2.length)
           {
               if(ar1[i]<ar2[j])    //1<2
               {

                   ar[k++]=ar1[i++];  //ar[1]=1; //ar[3]=3
               }
               else {

                   ar[k++]=ar2[j++]; //ar[2]=2;
               }

           }
        System.out.println(Arrays.toString(ar));


    }
}
