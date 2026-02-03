package repetativeCharOrWordFromString;

import java.util.HashMap;

public class countCharDynamically {

    public static void main(String[] args) {

        String name="My name is kiranaaaaaaaaaaa";

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

        System.out.println(map);


       for(char a: map.keySet())
       {
           if(a!=' ' ) {
               System.out.println(a + " is repeated " + map.get(a) + " times");
           }
       }
    }
}
