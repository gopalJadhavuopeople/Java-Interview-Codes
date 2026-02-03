package integers;

public class largestFromThreeNumb {


    public static void main(String[] args) {

        int a=10;
        int b=30;
        int c=40;

        /***using if-else block ***/
        /*int largestNo=0;

        if(a>b && a>c)
        {
            largestNo=a;
        }
        else if(b>a && b>c)
        {
            largestNo=b;
        }
        else {
            largestNo=c;
        }

        System.out.println(largestNo);*/

        /***using ternary operator ***/

        int largest=a>b?a:b;
        System.out.println(largest);
        int largest1=c>largest?c:(a>b?a:b);
        System.out.println(largest1);

    }
}
