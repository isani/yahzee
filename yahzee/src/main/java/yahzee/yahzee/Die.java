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
    private final int dieSize;
    private final Random random = new Random();
    
    // default Die
    public Die() {
        this.dieSize = 6;
    }
    
    // Generic Die
    public Die(int dieSize) {
        this.dieSize = dieSize;
    }
    
    public int rollDie() {
        return 1 + random.nextInt(dieSize);
    }
    
    public int[] roll5Dice() {
        
        int[] dice = new int[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = rollDie();
        }
        
        return dice;
    }
    
    public void showDice(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
            System.out.print( dice[i]+" ");
        }
    }
}