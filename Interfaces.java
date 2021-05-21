public class Interfaces {
    public static void main(String args[]){
        // Interface is a type, just like a class.

        // implemented() method returns an object that implements the Implementable interface.
        Implementable im = implemented();
        im.printer();
        //  static methods in an interface are invoked without an instance of a class implementing the interface.
        Implementable.staticPrinter();
        // Error : bPrinter() is not in interface Implementable
        // im.bPrinter();
        // im can be used to access the printer() method, 
        // it cannot access any other members of the Implemented class.
    }

    // Returns an object that implements Implementable Interface
    static Implemented implemented(){
        return new Implemented();
    }
    public interface NestedInterface{
        void nestedPrinter();
    }
    
}
// Subinterface B extends Superinterface Implementable
interface B extends Implementable {
    void bPrinter();
}

// Interface Partial Implementations
abstract class NotImplemented implements B{
    // Does not implement any interface hence abstract
}

// Implements NestedInterface by using fully qualified name
class Implemented extends NotImplemented implements Interfaces.NestedInterface{
    // All methods below have to be public as we cannot reduce visibility to default.
    public void printer(){
        System.out.println("Interface var is:"+ VAL);
    }
    public void bPrinter(){

    }
    public void nestedPrinter(){
        System.out.println("NestedInterface printer()");
    }
}

// Marker Interface
interface Marker{
    // Always empty
}