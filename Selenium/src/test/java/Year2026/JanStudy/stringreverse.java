package Year2026.JanStudy;

public class stringreverse {

    public static void main(String[] args) {
        String str = "My Favourite cricketer is Virat Kohli";
        //output word kept as its position and reverse only character

        String[] word = str.split(" ");


        for (int i = 0; i <= word.length - 1; i++) {
            String reverse = "";
            char[] chars = word[i].toCharArray();
            for (int j = chars.length - 1; j >= 0; j--) {
                reverse += chars[j];

            }

            System.out.print(reverse+" ");



        }

    }
}
