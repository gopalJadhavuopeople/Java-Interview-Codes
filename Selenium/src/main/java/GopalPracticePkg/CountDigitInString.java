package GopalPracticePkg;

public class CountDigitInString {
    public static void main(String[] args) {
        String name = "Gopal457004789524458hjsdhgj";
        char[] c = name.toCharArray();
        int numOfDidit =0;
        int numOfAlphabet = 0;
        for(int i = 0; i<=c.length-1 ; i++){
            if(Character.isDigit(c[i])){

                numOfDidit++;

            }else{
                numOfAlphabet++;
            }

        }
        System.out.println("Number of digit in a string is : "+ numOfDidit  );
        System.out.println("Number of Alphabet in a string is : "+ numOfAlphabet  );
    }
}
