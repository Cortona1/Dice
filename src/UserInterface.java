import java.util.Collections;
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
        introduction();
        askUser();
        rollDice();
        gameResults();

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

        System.out.println("Let the games begin! ^_^\n");

        while(true) {
            System.out.print("Write \"roll\" to roll the dice otherwise type quit to end the game:  ");
            String userInput = reader.nextLine();

            if (!userInput.equals("roll")){
                break;
            } else {
                pointOrder(round);
                diceResults(round);
                round++;

            }



        }

    }

    public void pointOrder(Integer round) {
        int order = 1;
        System.out.println("\nRound " + round + "\n" + "\nRoll order: " );

        for (Player player : this.playerList) {
            System.out.println("  " + order + ". " + player.diceResults());
            player.playerRollsDice(round);
            order++;
        }
        System.out.println("");

    }

    public void diceResults(Integer round) {
        System.out.println("Results of round " + round);

        for (Player player : this.playerList) {
            System.out.println(player.getName() + "\n" + "  dice rolls: " + player.getDiceRoll(round).rolls());
        }
        System.out.println("");
        Collections.sort(this.playerList);
    }

    public void gameResults(){
        int helper = 1;
        Collections.reverse(this.playerList);
        System.out.println("\n********************************\n      Thanks for playing!\n" +
                "********************************\n"+ "\nLeaderboard: \n" + "Rank     Name");
        for (Player player : this.playerList) {
            System.out.println( helper + ".  " + player.diceResults());
            helper++;
        }

        

    }

    public void introduction() {
        System.out.println("\n********************************************************"
                + "\n    Lets play a game of dice, the highest score wins\n" + "************************************" +
                "********************"
                + "\nRolling higher numbers will give you"
                + " more points and the player with the most points win\n");
    }
}
