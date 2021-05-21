package Classes;
import java.util.*;

public class Static {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
  
        System.out.print("Enter the value of health:");
        int a = sc.nextInt();

        Player p1 = new Player();
        Player p2 = new Player();
        
        //Calling a static method to initialize health
        Player.setHealth(a); 

        System.out.println("\np1.getHealth(): " + p1.getHealth());
        System.out.println("p2.getHealth(): " + p2.getHealth());

        // Age is not initialized by any setter
        System.out.println("p2.getAge(): " + p2.getAge());

         /* Main is static. Cannot use 'this'. */
        // System.out.println(this); 
    }
    
}

class Player 
{ 
    private static int health; 
    // Age is initialized by initializer
    private static int age; 

    // Static Initializer Block
    // Executed before constructor everytime.
    static
    {
        System.out.println("Inside initializer");
        health = 100;
        age=18;
    }

    // Default constructor required
    public Player(){} 

    public Player(int health){
        Player.health = health;
    }
    // non-static getter
    public int getHealth() 
    { 
        return health; 
    } 
    public int getAge() 
    { 
        return age; 
    } 

    // static setter
    public static void setHealth(int h) 
    { 
        health = h; 

        // Incorrect as static cannot be referenced by an object
        //this.health = h; 
    } 

}