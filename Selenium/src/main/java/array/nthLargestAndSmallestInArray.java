package array;

import org.bson.io.BsonOutput;

import java.util.Arrays;
import java.util.Scanner;

public class nthLargestAndSmallestInArray {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int ar[]={2,1,5,4,7,8,10,9};
        System.out.println("enter array value");
        Arrays.sort(ar);
        System.out.println("small"+ar[sc.nextInt()-1]+" large"+ar[ar.length-sc.nextInt()]);

    }
}
