package String;

public class noOfWordsInString {

    public static void main(String[] args) {
        String sen="I am working in ascent";

      /*  String []ar=sen.split(" ");
        System.out.println(ar.length);
*/
        int count=1;

        for(int i=0; i<sen.length(); i++ )
        {
            if((sen.charAt(i))==' '&& (sen.charAt(i+1))!=' ')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
