package integers;

public class primeNumber {

    public static void main(String[] args) {


         int totalPrimeNo=0;

        for(int num=0; num<=100;num++)
        {
            int count=0;
            if (num > 1)
            {
                for (int i = 1; i <= num; i++)
                {
                    if (num % i == 0)
                    {
                        count++;
                    }
                }

                if (count == 2)
                {
                    System.out.print(num + ",");
                    totalPrimeNo++;
                }
            }
        }
        System.out.println();
        System.out.println(totalPrimeNo);
    }
}
