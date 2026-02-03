package String;

public class splitTheStringWithuoutSplitMethod {

    /** Split the String without using split method ***/

    public static void main(String[] args) {

        String name="My Name is kiran";

        String wrd="";

       /* for(int i=0; i<name.length(); i++)
        {
               if (name.charAt(i) != ' ')
               {
                        wrd = wrd + name.charAt(i); //my //Name //is
               } else if(name.charAt(i)==' ')
               {
                   System.out.println(wrd);
                        wrd = "";
               }
        }

        //This we have to add as space is not there after last word,

        if(!wrd.isEmpty())
        {
            System.out.println(wrd);
        }*/

        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)!=' ')
            {
                System.out.print(name.charAt(i));
            }
            else
            {
                System.out.println();
            }
        }
    }
}
