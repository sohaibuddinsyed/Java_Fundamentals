package Classes;

public class Instances {
    public static void main(String args[]){
        // mic1 is a var
        MyInstanceClass mic1 = new MyInstanceClass();
        MyInstanceClass mic2 = mic1;
        mic1.setA(10);
        System.out.println(mic1.getA());
        mic2.setA(20);
        System.out.println(mic2.getA());
    }

}
class MyInstanceClass{
    private int a;
    private String name;

    // Initializers are executed before constructor
    {
        System.out.println("Initializer called.");
        a = 10;
        name = "ssd";
    }
    MyInstanceClass(){
        System.out.println("Constructor called.");
    }
    protected void finalize(){
        System.out.println("Finalize called.");
    }
    void setA(int a){
        this.a = a;
    }
    int getA(){
        System.out.println("int a has value :");
        return this.a;
    }
}