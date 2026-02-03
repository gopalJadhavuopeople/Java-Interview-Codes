package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateMakeUniformString
{
    /*** Input="my My Name NaME nAme is Is Kiran kIran"
     *
     *
     *output="my name is kiran"
     */
    public static void main(String[] args) {

        String input= "my My Name NaME nAme is Is Kiran kIran";

        String reqInput="";

        for(int i=0; i< input.length(); i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                reqInput=reqInput+Character.toLowerCase(input.charAt(i));
            }
            else
            {
                reqInput=reqInput+input.charAt(i);
            }
        }

        System.out.println("lower case sentence is : "+reqInput);

        String[] ar =reqInput.split(" ");

        /** Logic 1 **/

       /* ArrayList<String> array=new ArrayList<>();

        for(int i=0; i<ar.length; i++)
        {
            if(!array.contains(ar[i]))
            {
                array.add(ar[i]);
                System.out.print(ar[i]+" ");
            }
        }*/


        /*** logic 2 ***/
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(ar));

        StringBuilder op= new StringBuilder();

        for(String s:set)
        {
            op.append(s).append(" ");
        }
        System.out.println(op);

    }
}
