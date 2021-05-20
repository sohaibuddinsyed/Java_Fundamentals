package Classes;
// Objects
// Interfaces
// Abstract classes
// COllections
public class OOPS extends c implements A,B{
    
    // integer a with value 10. Print it onto console.
    static int a;
    public static void main(String []args){
        OO obj=new OO();
        obj.speed();
        obj.speed(100);
        System.out.println(a);
        OV ob=new OV();
        ob.speed();
        HelloWorld.hello();
    }
    public void apple(){

    }
    public void ball(){

    }
    public void cat(){

    }
}
interface A{
    public void apple();
}
interface B{
    public void ball();
}
abstract class c{
    abstract public void cat();
}

class OO{
    private int a;
    // public OO(int c){
    //     this.a=c;
    // }
    public void speed(int n){
        System.out.println("From speen(n):"+ n);
    }
    public void speed (){
        System.out.println("From speed()"+a);
    }
}
class OV extends OO{
    public void speed(){
        System.out.println("Överidden");
    }
}