
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner reader;
    private ArrayList<Player> playerList;


    public UserInterface(Scanner reader) {
        this.reader = reader;
        playerList = new ArrayList<Player>();

    }
    public void Start() {
        System.out.println("\nLets play a game of dice, the highest score wins\n" + "\nRolling higher numbers will give you"
                + " more points the player with the most points win\n");
        askUser();
        rollDice();


    }

    public void askUser() {
        System.out.println("Please enter the names of all players individually.\n" + "Pressing enter with nothing typed"
                + " will bring you to the rolling phase\n" );

        while(true) {
            System.out.print("  Enter the name of the players: ");
            String userInput = reader.nextLine();

            if (userInput.equals("")) {
                System.out.println("");
                break;
            } else {
                playerList.add(new Player(userInput));
            }

        }
    }

    public void rollDice() {
        int round = 1;


    }
}
