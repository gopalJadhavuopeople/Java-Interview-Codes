package GopalPracticePkg;

public class revesreDigitInStr {

    public static void main(String[] args) {
        String str = "gopal 1234 india 5678";

        // Step 1: Extract all digits into a StringBuilder
        StringBuilder digits = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        // Step 2: Reverse the digits
        digits.reverse();

        // Step 3: Replace digits in original string with reversed order
        StringBuilder result = new StringBuilder();
        int digitIndex = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(digits.charAt(digitIndex++));
            } else {
                result.append(ch);
            }
        }

        System.out.println("Original : " + str);
        System.out.println("Modified : " + result);
    }
}
