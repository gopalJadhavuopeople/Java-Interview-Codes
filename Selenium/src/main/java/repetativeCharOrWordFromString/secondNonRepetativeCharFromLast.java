package repetativeCharOrWordFromString;

import java.util.HashMap;

public class secondNonRepetativeCharFromLast {

    /*****Second non repetative character from last ****/

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

        int count=0;

        for(int i=name.length()-1; i>=0; i--)
        {
            char c=name.charAt(i);
            if(map.get(c)==1)
            {
                count++;
                if(count==1)
                {
                    continue;
                }

                System.out.println("second from last non repetative character is : "+c);
                break;
            }
        }
    }
}

