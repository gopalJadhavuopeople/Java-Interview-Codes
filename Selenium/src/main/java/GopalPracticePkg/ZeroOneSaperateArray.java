package GopalPracticePkg;

import java.util.Arrays;

public class ZeroOneSaperateArray {
    public static void main(String[] args) {
        int[] ar ={0,1,0,1,1,0};

        int[] finalArray = new int[ar.length];

        int k=0;

        for(int i = 0; i<ar.length; i++){

            if(ar[i]!=0){
                finalArray[k++]=ar[i];

            }

        }

        while(k<ar.length){
            finalArray[k++]=0;
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
