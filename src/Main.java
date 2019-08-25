
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        UserInterface game = new UserInterface(reader);

        game.Start();
    }
}
