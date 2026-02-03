package array;

public class missingNumberArray
{

    public static void main(String[] args) {
        int ar[]={1,2,3,5};

        int firstValue=ar.length+1;//5

        int expctdSum=firstValue*(firstValue+1)/2;//15

        int actualSum=0;

        for(int a:ar)
        {
            actualSum+=a;//11
        }

        int missingNumber=expctdSum-actualSum;//15-11

        System.out.println(missingNumber);//4
    }

}
