package array;

public class sumOfElementsInArray
{


    public static void main(String[] args) {
        int ar[]={2,5,7,8,9};

        int ref=0;

        for (int i=0; i<ar.length; i++)
        {
            ref=ref+ar[i];
        }

        System.out.println(ref);
    }
}
