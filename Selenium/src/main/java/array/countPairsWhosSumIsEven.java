package array;

public class countPairsWhosSumIsEven
{

    public static void main(String[] args)
    {
        int[] ar ={2,5,7,8,9,10,11,14};

        int count=0;

        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                int sum=ar[i]+ar[j];
                if(sum%2==0)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
