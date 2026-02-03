package array;

public class secondMinimunNumberArray {


    public static void main(String[] args) {
        int ar[]={5,6,8,2,3,5};

        int min=Integer.MAX_VALUE;

        for(int a:ar)
        {
            if(a<min)
            {
                min=a;
            }
        }

        System.out.println("minimum value is : "+min);

        int secondMin=Integer.MAX_VALUE;
        for(int a:ar)
        {
            if(a>min && a<secondMin)
            {
                secondMin=a;
            }
        }

        System.out.println(secondMin);
    }

}
