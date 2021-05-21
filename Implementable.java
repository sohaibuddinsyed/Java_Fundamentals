// If interface is declared as public, it can be used by other classes. 
// A public interface must be declared in a file with the same name. 
// interface fields are automatically assumed to be static, final, and public
public interface Implementable {
    int VAL = 100;
    void printer();
    
    // private methods but are static and can be called only by static interface methods. 
    private static void privatePrinter(){
        System.out.println("Private printer called.");
    }
    default void newPrinter(){
        System.out.println("New printer added later on");
    }
    static void staticPrinter(){
        System.out.println("Static printer");
        privatePrinter();
    }
}
