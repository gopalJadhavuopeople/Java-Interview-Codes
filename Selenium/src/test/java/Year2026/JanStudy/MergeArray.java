package Year2026.JanStudy;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        int[] arr2 = {4, 5, 6};

        //output {1,2,3,4,5,6}

        int[] arr3;
        arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[i] = arr1[i];

        }
        for (int j = 0; j <= arr2.length-1; j++) {
            arr3[arr1.length+j] = arr2[j];

        }

            System.out.print(Arrays.toString(arr3));




    }

}
