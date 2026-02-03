package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateCharFromString {

    public static void main(String[] args) {
        String input="kkirrann waadnne";

        /****Logic 1*****/

       /* ArrayList<Character> list=new ArrayList<>();


        for(char a: input.toCharArray())
        {
            if(!list.contains(a))
            {
                list.add(a);
                System.out.print(a);
            }

        }*/


        /******Logic 2*************/

        LinkedHashSet<Character> set=new LinkedHashSet<>();

        for(char c:input.toCharArray())
        {
            if(set.add(c))
            {
                System.out.print(c);
            }
        }


    }
}
