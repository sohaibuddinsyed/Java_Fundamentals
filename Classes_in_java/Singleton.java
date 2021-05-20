
public class Singleton{
    public static void main(String[] args){
        Instance in1 = Instance.getInstance();
        Instance in2 = Instance.getInstance();
        if(in1 == in2){
            System.out.println("Same instances");
            // System.out.println(in1);
        }
    }
}

class Instance{
    // get Instance is static and only one instance to be used, hence static instance.
    public static Instance instance;

    // Constructor is private. Can never be instantiate dexternally.
    private Instance(){}

    // Static method below is used to invoke private constructor.
    public static Instance getInstance(){
        if(instance == null) 
            instance = new Instance();
        return instance;
    }
}