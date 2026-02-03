package String;

import java.util.HashMap;

public class longestWordInSentence {

    public static void main(String[] args) {
        String input="Kiran is my name and I am working abcdefg in ascent 1234567 1234567";

        String[] ar = input.split(" ");

        /********Logic 1*****/
/*        int max=Integer.MIN_VALUE;
        String maxLength="";
        for (String s : ar)
        {
            int a = s.length();

            if (a > max)
            {
                max = a;
                maxLength = s;
            }
        }
        System.out.println(maxLength);*/

        /********Logic 2*********/

        HashMap<String,Integer> map=new HashMap<>();

        for(String s:input.split(" "))
        {
                map.put(s,s.length());
        }

        System.out.println(map);

        int max=0;


        for(String s:map.keySet())
        {
            if(map.get(s)>max)
            {
                max=map.get(s);
            }
        }


        for(String s:map.keySet())
        {
            if(s.length()==max)
            {
                System.out.println(s);
            }
        }





    }
}
