package String;

import org.openqa.selenium.devtools.v125.css.model.CSSPositionTryRule;

import java.util.HashSet;

public class longestSubStringWithoutRepeatingChar {

    /*** Find the longest Substring without repeating the characters ****/

    public static void main(String[] args) {
        String input="abcabcdldmno";

        char ar[]=input.toCharArray();

        HashSet<String> strng=new HashSet<>();

        for(int i=0; i<ar.length; i++)
        {
            HashSet<Character> charSet=new HashSet<>();
            String sub="";
            for(int j=i; j<ar.length; j++)
            {
                if(charSet.contains(ar[j]))
                {
                    break;
                }
                else
                {
                    charSet.add(ar[j]);
                    sub=sub+ar[j];
                }
            }
            strng.add(sub);
        }

        int longSize=0;
        String longSub="";

        for(String s:strng)
        {
            if(s.length()>longSize)
            {
                longSize=s.length();
                longSub=s;
            }
        }

        System.out.println("Longest substring is: "+longSub+" having size "+longSize);


    }

}