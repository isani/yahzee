/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahzee.yahzee;
import java.util.Random;
/**
 *
 * @author tnli
 */

public class Die {
    public int[] dice;
    private final int dieSize;
    private final Random random = new Random();
    
    // default Die
    public Die() {
        this.dieSize = 6;
        dice = new int[5];
    }
    
    // Generic Die
    public Die(int dieSize) {
        this.dieSize = dieSize;
        dice = new int[5];
    }
    
    public int rollDie() {
        return 1 + random.nextInt(dieSize);
    }
    
    public int[] roll5Dice() {
        for (int i = 0; i < 5; i++) {
            dice[i] = rollDie();
        }
        return dice;
    }
    
    public int[] getDice() {
        return dice;
    }
    
    /**
     *
     * @param dice
     */
    public void setDice(int[] dice) {
        this.dice = dice;
    }
    
    public void showDie(int[] dice, int die) {
        System.out.print(dice[die]);
    }
    
    public void showDice(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
            System.out.print( dice[i]+" ");
        }
    }
}