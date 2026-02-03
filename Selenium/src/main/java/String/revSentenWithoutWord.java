package String;

public class revSentenWithoutWord {

    public static void main(String[] args) {
        String name="My name is kiran";

        String ar[]=name.split(" ");

            String rev="";

            for(int i=ar.length-1; i>=0; i--)
            {
                rev=rev+ar[i]+" ";
            }

        System.out.println(rev);

    }
}
