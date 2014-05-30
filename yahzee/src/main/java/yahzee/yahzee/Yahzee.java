package yahzee.yahzee;
import java.util.Scanner;

public class Yahzee 
{
    public static void main( String[] args )
    {
        System.out.println( "Yahtzee!" );
        
        Die die = new Die();
        
        Scanner scanner = new Scanner(System.in);
        
        die.setDice(die.roll5Dice());
        
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 +". settisi on: ");
            
            for (int j = 0; j < 5; j++) {
                System.out.print(j+1 + ". noppasi on: ");
                die.showDie(die.getDice(), j);
                System.out.println();
            }
            System.out.println("");
            System.out.println("Valitset ne jotka haluat heittää uudestaan kirjoittamalla niiden numerot ja paina enter:");
        }
    }
}

