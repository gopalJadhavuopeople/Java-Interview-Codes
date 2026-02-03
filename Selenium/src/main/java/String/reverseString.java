package String;

public class reverseString {



    public static void main(String[] args) {
        String name="Kiran";
        String rev="";
        /****using charAt method ****/
        /*
        for (int i=name.length()-1; i>=0; i--)
        {
            rev=rev+name.charAt(i);
        }

        System.out.println(rev);*/

        /*****using array method ****/

        char a[]=name.toCharArray();

        for(int i=a.length-1; i>=0; i--)
        {
            rev=rev+a[i];
        }

        System.out.println(rev);





    }
}
