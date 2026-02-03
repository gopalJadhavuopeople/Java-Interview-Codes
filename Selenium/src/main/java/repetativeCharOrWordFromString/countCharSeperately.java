package repetativeCharOrWordFromString;

public class countCharSeperately
{
    public static void main(String[] args) {

        String name="nnSSDDSSDDSSSSlllnnnnnnn";

        /** ouptut n=2,s=2, D=2,S=2 same for all char **/

        int count=1;
        for(int i=0; i<name.length(); i++)
        {
            char n=name.charAt(i);
            if(i<name.length()-1 && n==name.charAt(i+1))
            {
                count++;
            }
            else
            {
                System.out.println(n + " " + count);
                count=1;
            }
        }

    }

}
