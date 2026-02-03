package GopalPracticePkg;

import java.util.Arrays;

public class MergeArrayInSequence {

    public static void main(String[] args) {
        int ar1[]={1,3,5,7};
        int ar2[]={2,4,6,8};

        int[] merged = new int[ar1.length + ar2.length];

        //compare values and stored values in new array

        int i =0;
        int j =0;
        int k =0;

        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                merged[k++] = ar1[i++];
            }else{
                merged[k++] = ar2[j++];
            }

        }

        System.out.println(Arrays.toString(merged));






        //merge two arrays in sequence
    }

}
