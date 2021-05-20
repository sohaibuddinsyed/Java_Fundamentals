public class DataTypes {
    public static void main(String args[]){
        intTypes();
        floatTypes();
        charType();
        autoTypeConversion();
        
        // variable type inference - var
        variabletypeinference();
    }
    public static void intTypes(){

        // Integer literals in java
        int decimal = 20;
        System.out.println("From decimal system : " + decimal);
        int binary = 0b0000000000000001;
        System.out.println("From binary system : "+binary);
        int hex = 0x0000000A;
        System.out.println("From hex system : "+hex);
        int octal = 000000000007;
        System.out.println("From octal system : "+octal);

        byte b1 = 0b1111;
        System.out.println("Byte variable :"+ b1);
        // Error : byte is 8bit. range(-128 to 127).
        // b1=128;
        // System.out.println(b1);

        int bigint = 7_897_875;
        System.out.println(bigint);
    
    }
    static void floatTypes(){
        // Java implements the standard (IEEE-754) set of floating-point types and operators.

        // float f = 20e4;                                         // Anamoly
        double d1 = 20e4;                                   
        System.out.println(d1);

    }
    static void charType(){
        char a = 'A';
        char esc = '\'';
        System.out.println(a);
        System.out.println(esc);

        // you can perform arithmetic operations.
        a+=1;
        System.out.println("Arithmetic on character : "+a);
    }
    static void boolType(){
        // default false
        boolean t = true;              
        System.out.println("t is : " + t );                  // Anamoly
    }
    static void autoTypeConversion(){
        // Automatic conversions on assignments
        int i1= 10;
        long l1 = i1;
        System.out.println(l1);

        int f1 = 100;
        float ff = f1; 
        System.out.println(ff);

        // Automatic Type Promotion in Expressions
        int i2=10;
        byte b =11;
        long l2 = 100;
        //float f2 = 20.0;                                  //Anamoly
        double d1 = 20.0;
        System.out.println("Double answer by promotion : " + i2*b+d1*l2);
    }
    static void typeCasting(){
        // Type casting manually
        int f = 100;
        float ff = (float)f; 
        System.out.println(ff);
    }
    static void variabletypeinference(){
        // must declare the variable and assign a value in the same statement.
        var a =10.0;
        System.out.println("var type : "+a);

        var obj = new DataTypes();
    }
}
