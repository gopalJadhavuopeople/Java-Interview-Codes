package array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class zeroOneSeprateArray {

    /**** We can use this logic to seperate any number from 0 *****/
    public static void main(String[] args) {

        int[] ar ={0,1,0,1,1,0};

        int count=0;

        int [] finalArray=new int[ar.length];

        for(int a:ar)
        {
            if(a!=0)
            {
                finalArray[count++]=a;
            }
        }

        while (count<ar.length)
        {
            finalArray[count++]=0;
        }

        System.out.println(Arrays.toString(finalArray));























       /* int count=0;

        int[] finalArray =new int[ar.length];

        for(int a:ar)
        {
            if(a!=0)
            {
                finalArray[count++]=a;
            }
        }

        while (count<ar.length)
        {
            finalArray[count++]=0;
        }

        System.out.println(Arrays.toString(finalArray));
*/
}
}
