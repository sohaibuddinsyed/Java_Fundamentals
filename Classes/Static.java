package Classes;
import java.util.*;
public class Static {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String display = "Enter the value of a:";
        System.out.println(display);
        int a = sc.nextInt();
        HelloWorld.hello(); //Calling a static method

        Player p1 = new Player();
        Player.setHealth(a); // Proper way to access static method
        Player p2 = new Player();
        Player.setHealth(a+10);

        System.out.println(p1.getHealth());
        /* Main is static. Cannot use 'this'. */
        // System.out.println(this); 
        System.out.println(p2.getHealth());
    }
    
}

class Player 
{ 
    private static int health; 
    // Static Initializer Block
    static
    {
        // Executed before constructor everytime.
        System.out.println("Inside initializer");
        health = Static.sc.nextInt();
    }
    public Player(){} // Default constructor required
    public Player(int health){
        Player.health = health;
    }
    public int getHealth() 
    { 
        return health; 
    } 
    public static void setHealth(int h) 
    { 
        /*Incorrect as static cannot be referenced by an object*/
        //this.health = h; 
        health = h; 
    } 
    public String toString(){
        return "Stringified";
    }
    // protected void finalize(){
    // // finalization code here
    // System.out.println("Inside Finalize");
    // }

}