package String;

public class revRequiredWordFromString
{
    public static void main(String[] args)
    {
        String name="my name is kiran";

        String ar[]=name.split(" ");

        String rev="";

        for(int i=0; i<ar.length; i++)
        {
            if(i==0)
            {
                for(int j=ar[i].length()-1; j>=0; j--)
                {
                    rev=rev+ar[i].charAt(j);
                }

             continue;
            }

            rev=rev+" "+ar[i];  //my name

        }
        System.out.println(rev);
    }

}
