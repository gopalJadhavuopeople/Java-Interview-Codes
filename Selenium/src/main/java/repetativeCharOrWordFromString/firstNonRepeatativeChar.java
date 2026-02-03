package repetativeCharOrWordFromString;

import java.util.HashMap;

public class firstNonRepeatativeChar {

    public static void main(String[] args) {

        String name="kirankira";

        HashMap<Character, Integer> map=new HashMap<>();

        for(char a:name.toCharArray())
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else {
                map.put(a,1);
            }
        }

        System.out.println(map);

        for(int i=0; i< name.length(); i++)
        {
            char c=name.charAt(i);
                if (map.get(c) == 1)
                {
                    System.out.println(" First Non repetitive character in string is: " + c);
                    break;
                }
        }
    }
}
