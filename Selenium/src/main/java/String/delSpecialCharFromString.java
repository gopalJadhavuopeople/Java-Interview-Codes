package String;

public class delSpecialCharFromString {

    public static void main(String[] args)
    {
        String s="@#$Hello @@@World!";

        String replacedS=s.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(replacedS);
    }
}
