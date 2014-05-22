/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yahzee.yahzee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tnli
 */
public class RollerTest {
    
    Roller d6;
      
    @Before
    public void setUp() {
        d6 = new Roller(6);
    }
    
     @Test
     public void testTheDie() {
        
        int dieRoll = d6.rollDie();
        
        assertTrue(1 <= dieRoll && dieRoll <= 6);
     }
}
