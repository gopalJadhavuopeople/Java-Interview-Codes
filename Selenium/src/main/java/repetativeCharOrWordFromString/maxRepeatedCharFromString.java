package repetativeCharOrWordFromString;

import java.util.HashMap;

public class maxRepeatedCharFromString {
    /******** count maximum repeated char from string****/

    public static void main(String[] args) {

        String name = "attttttttt moolllya";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char a : name.toCharArray())
        {
            if (map.containsKey(a))
            {
                map.put(a, map.get(a) + 1);
            }else
            {
              map.put(a,1);
            }
        }

        int max=0;
        char c=' ';

        for(char a: map.keySet())
        {
            if(map.get(a)>max)
            {
                max=map.get(a);
                c=a;

            }
        }

        System.out.println("max repetative character is "+c+" repeated "+max+" times");
    }


}
