import java.util.Scanner;
import java.util.*;
public class NameCompare{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in); 
        
        String player1 = scan.nextLine();  
        
        String player2 = scan.nextLine();
        
        String[] pl1= player1.split(" ");
        
        String[] pl2 = player2.split(" ");
        
        if(pl1[1].equalsIgnoreCase(pl2[1]))
        	
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
        

    }
}