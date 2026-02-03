package Year2026.FullSinkUpGame;

import java.util.ArrayList;

public class StartUpBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<StartUp> startups = new ArrayList<>();
    private int numOfGuesses = 0;


    private void setUpGame() {
//first make some startup and assign the locations to them

        StartUp one = new StartUp();
        one.setName("poniez");
        StartUp two = new StartUp();
        two.setName("hacqi");
        StartUp three = new StartUp();
        three.setName("cabista");

        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink up three startups");
        System.out.println("poniez,hacqui,cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (StartUp startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a Guess");
            checkUserGuess(userGuess);
        }
        finishGame();

    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (StartUp startUpToTest : startups) {
            result = startUpToTest.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                startups.remove(startUpToTest);
                break;

            }

        }
        System.out.println("Result : " + result);
    }

    private void finishGame() {
        System.out.println("All startups are dead! Your stock is now worthless");

        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + "guesses.");
            System.out.println("You got out before your options Sank.");
        } else {
            System.out.println("Took you long enough " + numOfGuesses + "guesses.");
            System.out.println("Fish are dancing with your options.");

        }
    }

    public static void main(String[] args) {
        StartUpBust game = new StartUpBust();
        game.setUpGame();
        game.startPlaying();
    }


}
