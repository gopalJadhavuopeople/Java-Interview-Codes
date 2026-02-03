package repetativeCharOrWordFromString;

import java.util.HashMap;
public class countRepetativeWordsInString {
    public static void main(String[] args) {
        String demo="do well then do work work then then";
        String ar[]=demo.split(" ");
        HashMap<String, Integer>map=new HashMap<>();
        for(String a:ar)
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

        int max=0;
        String repeat="";
        for(String a:map.keySet())
        {
            if(map.get(a)>max)
            {
                max=map.get(a);
                repeat=a;
            }
        }

        System.out.println(repeat +"="+max);
    }
}
