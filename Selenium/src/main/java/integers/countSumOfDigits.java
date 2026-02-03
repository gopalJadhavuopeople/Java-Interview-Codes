package integers;

public class countSumOfDigits {

    public static void main(String[] args) {
        int num=66;

        int ref=0;

        while (num!=0)
        {
            int ref1=num%10;
            ref=ref+ref1;

            num=num/10;
        }

        System.out.println(ref);
    }
}
