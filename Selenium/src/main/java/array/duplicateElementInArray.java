package array;

import java.util.HashSet;

public class duplicateElementInArray {

    public static void main(String[] args) {
        int ar[]={5,5,3,2,1,8,3};

        //Approach 1
       /* for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println("Duplicate elements is : "+ar[i]+" ");
                }
            }
        }*/

        //Approach 2

        HashSet<Integer>set=new HashSet<>();

        for(int a:ar)
        {
            if(!set.add(a))
            {
                System.out.println("Duplicate element is : "+a);
            }
        }

        System.out.println(set);
    }
}
