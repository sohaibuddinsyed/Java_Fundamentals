// package Classes;

public class InnerClasses {
    
        /*
            MyInnerClass ic1 = new MyInnerClass() is an error since 
            javac is not be able to access MyInnerClass.

            To avoid this, let Main be the driver classes and 
            let nested classes be a local class outside Main 
            
            class Main{}
            class InnerClasses{ class MyInnerClasses{} }
            
            or follow solution below.
        */
    private int a ;
    static int s;
    InnerClasses(int a,int s){
        this.a =a;
        this.s= s;
    }
    public static void main(String args[]){
    
        InnerClasses ic1 = new InnerClasses(10,20);
        // javac can access MyInnerClass through ic1
        System.out.println("\n--------------- \nObject 1 : ");
        MyInnerClass mic1 = ic1.new MyInnerClass();
        MyStaticInnerClass msic1 = new MyStaticInnerClass();
        mic1.printer();
        msic1.printer();

        System.out.println("--------------- \nObject 2 :  ");
        InnerClasses ic2 = new InnerClasses(100,200);
        MyInnerClass mic2 = ic2.new MyInnerClass();
        MyStaticInnerClass msic2 = new MyStaticInnerClass();
        mic2.printer();
        msic2.printer();

        /*
           Every class used by a Java application is represented in memory by an object of type Class.
           We can get a Class object by using the getClass() method.
           It is defined by the Object class, so it's available to every object.
        */
        Class c1 = ic1.getClass();
        Class c2 = ic2.getClass();
        if(c1 == c2){
            System.out.println("\n\nc1, c2 are objects of same class -" + ic1.getClass().getName());
        }
    }

    /*
        A nested class has access to the members, including private members, of the class in which it is nested.
        The scope of a nested class is bounded by the scope of its enclosing class.
    */
    class MyInnerClass{
        private int b = 0;
        void printer(){
            System.out.println("private int a in OuterClass is: "+ a);
            System.out.println("private int b in NestedClass is: "+ b);
        }
    }
    // It must access the non-static members of its enclosing class through an object.
    // It cannot refer to non-static members of its enclosing class directly.
    static class MyStaticInnerClass{
        int b=10;
        void printer(){
            System.out.println("static private int s in OuterClass is: "+ s);
            System.out.println("private int b in NestedClass is: "+ b);
        }
    }
}

// an inner class has more access to its outer class than a subclass has to its superclass.