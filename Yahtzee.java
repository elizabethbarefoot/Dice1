
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
        
    }
    
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
        public void roll(int dieNumber) {
        if (dieNumber >= 1 && dieNumber <= 5) {
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
            die5.roll();
        } else {
            System.exit(0);
        }
    }

    public String summarize() {
        int[] counts = new int[6];
        for (Die6 die : new Die6[]{die1, die2, die3, die4, die5}) {
            counts[die.getValue() - 1]++;
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
        return "Dice values: " + Arrays.toString(dice);
    }

}
