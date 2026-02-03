package Year2025;

public class randomNumberOptionalWay {

    static String a="kkk";

    /*    public static void main(String[] args) {
            Random random = new Random();
            // Generate a random number and convert it to base 36
            String randomString = Long.toString(random.nextLong(), 36).substring(15);

            // Print the random string
            System.out.println(randomString);
            

    }*/
    public static void main(String[] args) {
        double value1 = 1150;
        double value2 = 160;

        double rounded1 = (value1 / 100) * 100; // Rounds down to 1100
        double rounded2 = (value2 / 100) * 100; // Rounds down to 100

        System.out.println("Rounded value of 1150: " + rounded1); // Output: 1100
        System.out.println("Rounded value of 160: " + rounded2); // Output: 100
    }
}
