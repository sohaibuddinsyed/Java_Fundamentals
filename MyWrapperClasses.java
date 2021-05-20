// Java type wrappers are classes that encapsulate a primitive type within an Object.
public class MyWrapperClasses {
    public static void main(String args[]){
        Wrappers w = new Wrappers();
        indent("Int wrappers");
        w.intWrappers();

        indent("Char wrappers");
        w.charWrappers();

        indent("Boolen Wrappers");
        w.booleanWrappers();

        indent("Double Wrappers");
        w.doubleWrappers();

        indent("String Wrappers");
        w.stringWrappers();

        indent("Unsigned Wrappers");
        w.unsignedWrappers();

        indent("AUtoboxing and unboxing");
        w.boxingWrappers();

    }
    public static void indent(String s){
        System.out.println();
        System.out.println(s);
        System.out.println("----------------------");
    }
    
}

class Wrappers{
    void intWrappers(){
        // Deprecated
        // Integer i = new Integer(i)

        // Below can be done for char, bool, all float and int types
        Integer i1 = Integer.valueOf(10);
        System.out.println("Int wrapper :" + i1 );
        Integer i2 = Integer.valueOf(10);
        System.out.println("Beofre modifying i2, i1 == i2 :" + (i1==i2));
        System.out.println("i1.equals(i2) : " + i1.equals(i2));
        i2+=1;
        System.out.println("i1 now is "+i1);
        System.out.println("i2 now is "+i2);
        System.out.println("After modifying i2, i1 == i2 :" + (i1==i2));
        System.out.println("i1.equals(i2) : " + i1.equals(i2));

        // Assigning primitive vars with wrapper vars
        int i3 = i1.intValue();
        System.out.println("i1.intValue() : " + i3);
    }
    void charWrappers(){
        char arr[] = {'a',1,'A', ' '};
        // Fatal error
        // System.out.println("arr[0].isLowerCase() : " + arr[0].isLowerCase(arr[0]));
        
        Character c1 = Character.valueOf(arr[0]);
        System.out.println("Character.isDigit() : " + Character.isDigit(c1));
        System.out.println("Character.isLetter() : " + Character.isLetter(c1));
        System.out.println("Character.isLowerCase() : " + Character.isLowerCase(c1));
        System.out.println("Character.toUpperCase() : " + Character.toUpperCase(c1));
        System.out.println("Character.MAX_RADIX : " + Character.MAX_RADIX);
    }
    void booleanWrappers(){
        Boolean b = Boolean.TRUE;
        boolean b2 =Boolean.TRUE;
        boolean b3 = Boolean.valueOf("TrUe");
        System.out.println("Boolean.valueOf(\"TrUe\") : " + b3);
        boolean b4 = Boolean.parseBoolean("ssd");
        System.out.println("Boolean.parseBoolean(\"ssd\") : " + b4);
    }
    void doubleWrappers(){
        Double d1 = Double.valueOf("10.0");
        double d2 = d1.doubleValue() + 10;
        Double d3 = Double.valueOf(0/0.0);
        Double d4 = Double.valueOf(1/0.0);

        System.out.println("0/0.0 d3.isNAN() : "+ d3.isNaN());
        System.out.println("1/0.0 d4.isInfinite(): "+ d4.isInfinite());
    }
    void unsignedWrappers(){

    }
    void stringWrappers(){

    }
    void boxingWrappers(){
        // Instead of Integer a = Integer.valueOf(10);
        // Autoboxing
        Integer a = 10;
        // Instead of int b = a.intValue(10);
        // Unboxing
        int b = a;
    }
}