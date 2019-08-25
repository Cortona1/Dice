import java.util.Map;
import java.util.HashMap;

public class Player {

    private String name;
    private Map<Integer, DiceRoll> score;


    public Player(String name) {
        this.name = name;
        score = new HashMap<Integer, DiceRoll>();

    }

    public String getName() {
        return this.name;

    }

    public DiceRoll getDiceRoll(Integer round) {
        return this.score.get(round);
    }

    public void playerRollsDice(Integer round) {
        DiceRoll newRoll = new DiceRoll();
        score.put(round, newRoll);

    }
}
