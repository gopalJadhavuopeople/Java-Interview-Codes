package String;

public class reverseWordSamePostion {

    public static void main(String[] args) {

        String name="My name is kiran";

        String[] ar =name.split(" ");

        String reversedSen="";

        for(String a:ar)
        {
            String revWord="";

            for(int i=a.length()-1; i>=0; i--)
            {
                revWord=revWord+a.charAt(i);
            }

            reversedSen=reversedSen+revWord+" ";
        }

        System.out.println(reversedSen);
    }
}
