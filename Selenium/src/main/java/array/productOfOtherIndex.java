package array;

import java.util.Arrays;

public class productOfOtherIndex {
//other than current index calculate the product of other index values
    public static void main(String[] args) {
        int[] ar ={2,4,3,5,6};

        int[] newar =new int[ar.length];


        for(int i=0; i<ar.length; i++)
        {
            int ref=1;
            for(int j=0; j<ar.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                else {
                    ref=ref*ar[j];
                }
            }
            newar[i]=ref;
        }

        System.out.println(Arrays.toString(newar));
    }
}