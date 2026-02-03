package repetativeCharOrWordFromString;

import java.util.HashMap;

public class secondNonRepetativeCharFromStart {

    /***** find second non repetative character from start
     */

    public static void main(String[] args) {
        String name="kiranian";

        HashMap<Character,Integer> map=new HashMap<>();

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
        for(int i=0; i<name.length(); i++)
        {
            char c=name.charAt(i);

            if(map.get(c)==1)
            {
                count++;

                if(count==1)
                {
                    continue;
                }

                System.out.println("second non repetative character from start is: "+c);
                break;
            }

        }
    }
}
