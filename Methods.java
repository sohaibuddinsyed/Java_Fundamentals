
public class Methods {
    public static void main(String args[]){
        Sample s1 = Sample.objectcreate();

        // Overloading calls
        s1.varargs(1,2,3,4);
        s1.varargs(1.0,2.0);

        // Overloading with type conversions
        s1.varargs(1.0,3,4);
    }

}
class Sample{
    static Sample objectcreate(){
        return new Sample();
    }

    void varargs(int ... a){
        System.out.println("\nInt Var-args array is:");
        for(int x: a){
            System.out.print(x+ " ");
        }
    }

    void varargs(double ... a){
        System.out.println("\nDouble Var-args array is:");
        for(double x: a){
            System.out.print(x+ " ");
        }
    }
}