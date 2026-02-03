package String;

public class countAndPrintSubstringWithSameStartAndEndChar {
/****Suppose input=abcba, output=a,b,c,b,a,abcba,bcb then total count 7 ****/
    public static void main(String[] args) {
        String input="abcba";

        int count=0;

        String sub="";

        for(int i=0; i<input.length(); i++)
        {
            for(int j=i; j<input.length(); j++)
            {
                if(input.charAt(i)==input.charAt(j))
                {
                    sub=sub+input.substring(i,j+1)+" ";
                    count++;

                }

            }

        }
        System.out.println(sub);
        System.out.println(count);
    }
}
