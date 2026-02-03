package repetativeCharOrWordFromString;

import java.util.HashSet;

public class printDuplicateCharFromString {

    public static void main(String[] args) {
        String input="Kiran Wadne W";

        /***** logic 1 ****/
       /* for(int i=0; i<input.length(); i++)
        {
            for(int j=i+1; j<input.length(); j++)
            {
                if(input.charAt(i)==input.charAt(j) && input.charAt(i)!=' ')
                {
                    System.out.println(input.charAt(i));
                }
            }
        }*/

        /****Logic 2 *****/

        HashSet<Character> set=new HashSet<>();

        for(char c:input.toCharArray())
        {
            if(!set.add(c) && c!=' ')
            {
                System.out.println(c);
            }
        }
    }
}
