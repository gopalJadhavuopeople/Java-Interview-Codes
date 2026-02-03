package array;

public class secondLargestNoArray {

    public static void main(String[] args)
    {
        int ar[]={5,7,3,4,8,9};

        int max=Integer.MIN_VALUE;

            for (int j : ar)
            {
                if (j > max)
                {
                    max = j;
                }
            }
            System.out.println("Maximum number in array: " + max);
            int secondmax = Integer.MIN_VALUE;
            for (int a : ar) {
                if (a < max && a > secondmax) {
                    secondmax = a;
                }

            }
    }
}
