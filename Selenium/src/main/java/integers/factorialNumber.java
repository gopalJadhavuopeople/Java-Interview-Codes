package integers;

public class factorialNumber {

    public static void main(String[] args)
    {
        int num=5;
        long ref=1;

        for(int i=1; i<=num; i++)
        {
            ref=ref*i;
        }

        System.out.println(ref);
    }
}
