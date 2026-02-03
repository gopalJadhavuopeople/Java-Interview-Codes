package repetativeCharOrWordFromString;

import java.util.HashMap;

public class nonRepetativeCharString {

    /***Find non repetative character from String****/

    public static void main(String[] args) {
        String name="at moolya";

        HashMap<Character, Integer> map=new HashMap<>();

        for(char a:name.toCharArray())
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }

        for(int i=0; i<name.length()-1; i++)
        {
            char c=name.charAt(i);

            if(map.get(c)==1 && c!=' ')
            {
                System.out.println("non repetative character is ; "+c);
            }
        }
    }
}
