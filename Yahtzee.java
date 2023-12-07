
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Yahtzee
{

    private  Die6[] dice;
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;

    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    { 
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();

        dice = new Die6[]{die1, die2, die3, die4, die5};

    }

    public void roll() {
        for (Die6 die : dice) {
            die.roll();
        }
    }

    public void roll(int dieNumber) {
        if (dieNumber >= 1 && dieNumber <= 5) {
            dice[dieNumber - 1].roll();
        } else {
            System.exit(0);
        }
    }

    public String summarize() {
        int[] counts = new int[6];
        for (Die6 dice : new Die6[]{die1, die2, die3, die4, die5}) {
            counts[dice.getValue() - 1]++;
        }

        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            summary.append((i + 1) + "-" + counts[i]);
            if (i < counts.length - 1) {
                summary.append("; ");
            }
        }

        return summary.toString();
    }

    public String toString() {
        return "Dice values: " + Arrays.toString(Arrays.stream(dice).mapToInt(Die6::getValue).toArray());
    }

}
