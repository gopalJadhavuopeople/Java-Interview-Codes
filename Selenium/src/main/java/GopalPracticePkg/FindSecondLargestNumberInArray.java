package GopalPracticePkg;

import java.util.Arrays;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {

        int arr[] = {20, 47, 52, 84, 98, 65, 42, 78, 85};
        int size = arr.length;

       // int[] sortArr = new int[size];

        //find the largest element in array

//        Arrays.sort(arr);
//
//        System.out.println("Largest element in array : " + arr[arr.length-1]);
//        System.out.println("Second Largest element in array : " + arr[arr.length-2]);

        for (int i = 0; i <= arr.length-1; i++) {

            for(int j = i+1; j <= arr.length-1; j++){

                if(arr[j]<arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }

            }



        }

        System.out.println(Arrays.toString(arr));
    }
}
