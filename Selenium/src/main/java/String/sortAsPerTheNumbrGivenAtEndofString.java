package String;

import java.util.TreeMap;

public class sortAsPerTheNumbrGivenAtEndofString {

    /******input=is3 kiran4 name2 my1
     *
     *
     * output="my name is kiran" ****/

  public static void main(String[] args)
  {
        String input="is3 kiran4 name2 my1";

        String ar[] =input.split(" ");

        TreeMap<Integer,String> map=new TreeMap<>();

        for(String a:ar)
        {
            char lastChar=a.charAt(a.length()-1);

            int lastInt=Integer.parseInt(String.valueOf(lastChar));

            map.put(lastInt,a.substring(0,a.length()-1));
        }

        System.out.println(map.values());

        String output="";

        for(int a:map.keySet())
        {
            output=output+map.get(a)+" ";
        }

        System.out.println(output);



    }
}
