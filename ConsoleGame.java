import java.util.Scanner;
interface StoryMode {
    void playStory();
}
interface SurvivalMode {
    void playSurvival();
}
interface GameControls {
    void startGame();
}

public class ConsoleGame implements StoryMode, SurvivalMode, GameControls {
    private String playerName;
    private int gameMode; 
    public static void main(String[] args) {
        ConsoleGame game = new ConsoleGame();
        game.startGame();
    }

    @Override
    public void startGame() {
        Scanner cyrus = new Scanner(System.in);

        System.out.print("|Enter your name: ");
        playerName = cyrus.nextLine();

        System.err.println("|"+"=======================================|");
        System.out.println("|"+"Press 1 or 2 to select your game mode. |");
        System.out.println("|"+"1 - Story                              |");
        System.out.println("|"+"2 - Survival                           |");
        System.out.println("|"+"=======================================|");
        System.out.print("|"+"Your choice: ");
        

        gameMode = cyrus.nextInt();
        cyrus.nextLine();

        System.err.println("|"+"=======================================|");
        System.out.println("|"+"Press P to start playing, " + playerName + ".");
        System.out.print("|");
        String start = cyrus.nextLine();
        System.out.println("|"+"=======================================|");
        System.out.println(" ");

        if (start.equalsIgnoreCase("P")) {
            if (gameMode == 1) {
                playStory();
            } else if (gameMode == 2) {
                playSurvival();
            } else {
                System.out.println("Invalid game mode selected. Exiting.");
            }
        } else {
            System.out.println("Game not started. Goodbye!");
        }

        cyrus.close();
    }

    @Override
    public void playStory() {
        System.out.println("Welcome to the Story mode, " + playerName + "!");
        System.out.println("Your journey begins in a mysterious forest...");
    }

    @Override
    public void playSurvival() {
        System.out.println("Welcome to Survival mode, " + playerName + "!");
        System.out.println("Survive as long as you can against endless waves of enemies!");
        System.out.println("=======================================");
    }
}