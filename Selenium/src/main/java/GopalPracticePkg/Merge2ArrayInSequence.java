package GopalPracticePkg;

import org.apache.commons.math3.analysis.function.Rint;

import java.util.Arrays;

public class Merge2ArrayInSequence {

    public static void main(String[] args) {
        int ar1[] = {1, 3, 5, 7};
        int ar2[] = {2, 4, 6, 8};

        int[] mergeAr = new int[ar1.length + ar2.length];

        int k = 0;

        for (int i = 0; i <= ar1.length-1; i++) {
            for (int j = 0; j <= ar2.length-1; j++) {

                if (ar1[i] < ar2[j]) {

                    mergeAr[k++] = ar1[i];


                } else {
                    mergeAr[k++] = ar2[j];
                }

            }

        }

        System.out.println(Arrays.toString(mergeAr));

        //merge both array in a sequence


    }
}
