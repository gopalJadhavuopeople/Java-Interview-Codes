package String;

import java.util.*;

public class palindromeDetectionInString {
    public static void main(String[] args)
    {

        //if input is abccba then output should be true
        // if input is abccbd then output should be false
        // half of the string should be equal to remaining string if we reverse it

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();


        boolean isEqual=false;

        if(s.length()%2==0)
        {

            for(int i = 0; i<s.length()/2; i++)
            {
                char a=s.charAt(i);
                char b=s.charAt(s.length()-i-1);
                if (a == b) //a,a //b
                {
                    isEqual = true;
                }else
                {
                    isEqual=false;
                    break;
                }
            }
        }

        System.out.println(isEqual);
    }
}
