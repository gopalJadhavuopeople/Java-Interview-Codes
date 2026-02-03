package Year2026.SinkUpGame;
import java.util.*;

public class SimpleStartUpTestDerive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper01 helper = new GameHelper01();
        SimpleStartUp dot = new SimpleStartUp();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum + 1));
        locations.add(String.valueOf(randomNum + 2));

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {

            String userGuess = helper.getUserInput("Enter a number");

            String result = dot.checkYourself(userGuess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
