

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class DiceRoll {
    private Random random;
    private List<Integer> rollResults;


    public DiceRoll() {
        this.random = new Random();
        rollResults = new ArrayList<Integer>();

        // We are going to just go ahead and calculate the six dice rolls in the constructor

        for (int i = 0; i < 6; i++) {
            this.rollResults.add(this.random.nextInt(7));

        }
    }

    public List<Integer> getRolls() {
        return this.rollResults;

    }


}
