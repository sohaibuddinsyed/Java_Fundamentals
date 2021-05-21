package Classes;

public class AbstractClasses extends MyAbstractClass{
    public static void main(String args[]){
        AbstractClasses ac1 = new AbstractClasses();
        ac1.abstractMethod();
        ac1.concreteMethod();
    }
    void abstractMethod(){
        System.out.println("Abstract method implemented and called.");
    }
}

// We cannot declare abstract constructors, or abstract static methods.
// Any class that contains one or more abstract methods must be declared as an abstract class.
abstract class MyAbstractClass{
    // An abstract method
    abstract void abstractMethod();

    void concreteMethod(){
        System.out.println("I am a concrete method.");
    }
}
