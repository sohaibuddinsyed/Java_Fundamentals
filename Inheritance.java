public class Inheritance {
    public static void main(String args[]){
        // Upcasting
        // A Superclass Variable Can Reference a Subclass Object
        A c = new C();
        B b= new B();
        C cc=new C();
        System.out.println("c.getKey(): "+ c.getKey());

        // Manual Down Casting since cPrinter() is not in A.
        ((C)c).cPrinter();
        c.aPrinter();

        // Dynamic method dispatch 
        A a;
        
        a = b;
        // System.out.println("a.getkey(): "+ a.getkey());               //Anamoly
    }
}

class A{
    protected int key=1;
    protected String mssg = "Class A";
    A(){
        System.out.println("Constructor of A called.");
    }
    int getKey(){
        return this.key;
    }
    // Cannot be over-ridden.
    final void aPrinter(){
        System.out.println("Spl A method.");
    }
}
class B extends A{
    protected int key = 2;
    protected String mssg ="Class B";
    B(){
        System.out.println("Constructor of B called.");
    }
    int getKey(){
        return this.key;
    }
}
// Cannot be further extended
final class C extends B{
    protected int key = 3;
    protected String mssg ="Class C";
    C(){
        System.out.println("Constructor of C called.");
    }
    int getKey(){
        return this.key;
    }
    void cPrinter(){
        System.out.println("Spl C method.");
    }
}