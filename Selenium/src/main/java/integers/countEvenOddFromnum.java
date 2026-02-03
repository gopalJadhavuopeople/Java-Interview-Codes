package integers;

public class countEvenOddFromnum {

    public static void main(String[] args) {
        int num=12354;

        int evenNo=0;
        int oddNo=0;

        while (num!=0)
        {
            int digit=num%10;

            if(digit%2==0)
            {
                evenNo++;
            }
            else {
                oddNo++;
            }

            num=num/10;
        }

        System.out.println("even count is : "+evenNo);
        System.out.println("odd count is : "+oddNo);
    }
}
