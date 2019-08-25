

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
            this.rollResults.add(this.random.nextInt(6) + 1);

        }
    }

    public List<Integer> getRolls() {
        return this.rollResults;

    }

    public int getPoints() {
        int helper = 0;

        for (int i = 0; i < 6; i++) {
            helper += this.rollResults.get(i);
        }
        return helper;
    }

    public String rolls() {
        String helper = "[";
        for (int i=0; i<6; i++) {
            if (i==5) {
                helper += this.rollResults.get(i);
            } else {
                helper += this.rollResults.get(i) + ", ";
            }
        }
        return helper + "]";
    }

}
