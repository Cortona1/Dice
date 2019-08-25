
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
        System.out.println("Lets play a game of dice, the highest score wins");


    }
}
