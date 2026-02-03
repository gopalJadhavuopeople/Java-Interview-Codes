package Year2026.SinkUpGame;

import java.util.Scanner;

public class GameHelper01 {

    private Scanner scanner = new Scanner(System.in);

    public String getUserInput(String prompt) {

        System.out.print(prompt + " : ");
        return scanner.nextLine();
    }
}
