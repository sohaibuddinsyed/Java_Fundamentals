// package Classes;

public class Constructors {
    public static void main(String args[]){
        MyConstructorClass mcc1 = new MyConstructorClass(10,20,true);
        
    }
}
class MyConstructorClass{
    private int a;
    private int b;
    private boolean c;

    MyConstructorClass(){}

    MyConstructorClass(int a, int b){
        System.out.println("MyConstructorClass(int, int) called");
        System.out.println(this);
        this.a = a;
        this.b = b;
    }
    MyConstructorClass(int a, int b, boolean c){
        this(a,b);
        System.out.println("MyConstructorClass(int, int, boolean) called");
        this.c = c;
    }
    
}