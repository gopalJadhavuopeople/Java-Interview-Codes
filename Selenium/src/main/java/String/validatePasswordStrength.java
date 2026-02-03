package String;

public class validatePasswordStrength {

    /** validate the password Strength with Following conditions
     * 1) At least 8 characters
     * 2) Contains uppercase, lowercase, digit, and special character
     * ***/


    public static void main(String[] args) {
        String password="Java123@@@";
        char[] ar=password.toCharArray();


        boolean hasLowerChar=false;
        boolean hasUpperchar=false;
        boolean hasDigit=false;
        if (password.matches(".*[^a-zA-Z0-9].*") && ar.length>=8)
        {
         for(char c:ar)
         {

             if(Character.isUpperCase(c))
                {
                    System.out.println("test hasUpperchar");
                    hasUpperchar=true;
                }
                else if(Character.isLowerCase(c))
                {
                    System.out.println("test hasLowerChar");
                    hasLowerChar=true;
                }
                else if(Character.isDigit(c))
               {
                 hasDigit=true;
               }

            }
        }

        if(hasDigit && hasUpperchar && hasLowerChar)
        {
            System.out.println("password is strong");
        }
        else
        {
            System.out.println("password is weak");
        }
    }
}
