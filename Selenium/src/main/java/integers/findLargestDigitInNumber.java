package integers;

public class findLargestDigitInNumber {
    public static void main(String[] args) {
        int a=19532;

        int max=Integer.MIN_VALUE;

        while(a!=0)
        {
            int digit=a%10;

            if(digit>max)
            {
                max=digit;
            }

            a=a/10;
        }

        System.out.println(max);
    }

}

