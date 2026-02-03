package String;

import java.util.Scanner;

public class replacePerticularCharRespectiveToItsOccrnceCount
{
    /***
     * Replacing the perticular character with respective to its occurance count

     * input="go to" then output="g@ t@@"

     ****/
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        //go to

        int count=0;

        String updtdInput="";

        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i)=='o')
            {
                count++;
                for(int j=0; j<count; j++ )
                {
                    updtdInput=updtdInput+'@';
                }
            }
            else
            {
                updtdInput=updtdInput+input.charAt(i);
            }
        }


        System.out.println(updtdInput);
    }
}
