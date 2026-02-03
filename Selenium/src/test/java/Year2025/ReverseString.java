package Year2025;

public class ReverseString {

  /*  public static void main(String[] args) {

        String name="india";
        String rev="";

        for(int i=name.length()-1; i>=0; i--)
        {
             rev=rev+name.charAt(i);
        }

        System.out.println(rev);
    }*/

   /* public static void main(String[] args)
    {
        String name="India is my country";

        String[] w=name.split(" ");

        String rev="";

        for(int i=w.length-1; i>=0; i--)
        {
            rev=rev + w[i]+ " ";
        }

        System.out.println(rev);
    }*/
   public static void main(String[] args)
   {
       String name="India is my country";

       String[] w=name.split(" ");

       String rev="";

       for(int i=w.length-1; i>=0; i--)
       {
           for(int j=w[i].length()-1; j>=0; j--)
           {
               rev = rev + w[i].charAt(j);
           }

       }
       System.out.print(rev);

   }
}
