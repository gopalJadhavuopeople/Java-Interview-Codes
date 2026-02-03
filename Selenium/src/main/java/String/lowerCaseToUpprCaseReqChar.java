package String;

public class lowerCaseToUpprCaseReqChar {

    public static void main(String[] args) {
        String name="kiran machhindra wadne";

        String[] ar =name.split(" ");



        for(String a:ar)
        {
            String demo="";

            for(int i=0; i<a.length(); i++)
            {
                if(i==a.length()-1)
                {
                    demo=demo+Character.toUpperCase(a.charAt(i));
                }
                else
                {
                    demo=demo+a.charAt(i);
                }
            }
            System.out.print(demo+" ");
        }


    }
}
