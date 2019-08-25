
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
        System.out.println("Lets play a game of dice, the highest score wins\n");
        askUser();


    }

    public void askUser() {
        System.out.println("");


        while(true) {
            System.out.print("Enter the name of the players: ");
            String userInput = reader.nextLine();

            if (userInput.equals("")) {
                System.out.println("");
                break;
            } else {
                playerList.add(new Player(userInput));
            }

        }
    }
}
