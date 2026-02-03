package array;

public class minMaxFromArray
{

    public static void main(String[] args) {
        int ar[]={0,100,3,3,6,3,7};

        int min= 0;//Integer.MAX_VALUE;//-21566565
        int max=0;//Integer.MIN_VALUE;//21465656

        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }

            if(ar[i]<min)
            {
                min=ar[i];
            }
        }

        System.out.println("min number is : "+min);
        System.out.println("max number is : "+max);
    }
}
