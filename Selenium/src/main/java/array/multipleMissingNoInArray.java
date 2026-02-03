package array;

import java.util.ArrayList;
import java.util.HashSet;

public class multipleMissingNoInArray
{
  public static void main(String[] args)
  {
        int ar[]={1,2,4,6};
        int maxValue=6;

        HashSet<Integer> set=new HashSet<>();

        for(int a:ar)
        {
            set.add(a);
        }

        for(int i=1; i<maxValue; i++)
        {
            if(!set.contains(i))
            {
                System.out.println("missing number is : "+i);
            }
        }
    }
}
