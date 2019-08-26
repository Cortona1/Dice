import java.util.Map;
import java.util.HashMap;

public class Player implements Comparable<Player> {

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

    public int addPoints() {
        int helper = 0;

        for (DiceRoll diceroll : this.score.values()) {
            helper += diceroll.getPoints();
        }
        return helper;
    }

    public String diceResults() {
        return this.name + " (" + addPoints() + " points)";
    }

    @Override
    public int compareTo(Player player) {
        return addPoints() - player.addPoints();
    }
}
