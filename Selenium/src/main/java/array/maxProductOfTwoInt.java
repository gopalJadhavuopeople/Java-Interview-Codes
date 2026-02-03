package array;

public class maxProductOfTwoInt {
    public static void main(String[] args) {
        int ar[]={2,3,5,3,7,10};

        int defProduct=0;

        int a=0;
        int b=0;

        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                int newProduct=ar[i]*ar[j];
                if(newProduct>defProduct)
                {
                    a=ar[i];
                    b=ar[j];
                    defProduct=newProduct;
                }
            }
        }

        System.out.println("Two int are :"+a+","+b);
        System.out.println(defProduct);
    }
}
