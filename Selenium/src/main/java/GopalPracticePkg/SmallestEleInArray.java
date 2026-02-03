package GopalPracticePkg;

import java.util.Arrays;

public class SmallestEleInArray {

    public static void main(String[] args) {
         int ar[] = {10,56,41,52,14,3};

         int sortAr[] = new int[ar.length];

        int length = sortAr.length-1;

         //find smallest element in array

        //Arrays.sort(ar);

        //System.out.println(ar[0]);
        int smallest= ar[0];

        for(int i =0; i<= ar.length-1; i++){

            if(ar[i]<smallest){
                smallest= ar[i];
            }
        }

        System.out.println("Smallest Ele in Array : "+ smallest );



    }
}
