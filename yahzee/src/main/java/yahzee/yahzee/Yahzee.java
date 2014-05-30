package yahzee.yahzee;
import java.util.Scanner;

public class Yahzee 
{
    public static void main( String[] args )
    {
        System.out.println( "Yahtzee!" );
        
        Die die = new Die();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Settisi on: ");
        die.showDice( die.roll5Dice() );
        System.out.println(". Valitset ne jotka haluat heittää uudestaan kirjoittamalla niiden numerot ja paina enter:");
    }
}

