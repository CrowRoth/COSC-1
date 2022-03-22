/**
 * A PairOfDice object represents an ordinary pair of six-sided dice.
 */
public class PairOfDice {

    private Die die1,die2;
       // Number showing on the first die.
       // Number showing on the second die.

    public PairOfDice() {
        die1 = new Die();    // Constructor.  Rolls the dice, so that they initially
        die2 = new Die();
        // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public void roll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
        die1.roll();
        die2.roll();
    }
    
    public int getTotal() {return getDie1()+getDie2();}
    
    public int getDie1() {return die1.getVal();}
    
    public int getDie2() {return die2.getVal();}
    
    public String toString(){
        return (String.valueOf(die1)+ " " + String.valueOf(die2));
    }
    
} // end class PairOfDice
