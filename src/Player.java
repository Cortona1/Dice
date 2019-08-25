import java.util.Map;
import java.util.HashMap;

public class Player {

    private String name;
    private Map<Integer, DiceRoll> score;


    public Player(String name) {
        this.name = name;
        score = new HashMap<Integer, DiceRoll>();

    }
}
