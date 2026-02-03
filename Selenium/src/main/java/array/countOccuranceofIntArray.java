package array;

import java.util.HashSet;

public class countOccuranceofIntArray {

    public static void main(String[] args) {
        int ar[]={2,4,2,3,5,4,3,3,5,10,10,9,8,9};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0; i<ar.length; i++)
        {
            int count=0;

            if(!set.contains(ar[i]))
            {
                for (int j = 0; j < ar.length; j++)
                {
                    if (ar[i]==ar[j])
                    {
                        count++;
                    }
                }

                if (count >= 1)
                {
                    System.out.println(ar[i] + " is repeated " + count + " times");
                } else {
                    count = 0;
                }
            }
            set.add(ar[i]);
        }

    }
}
