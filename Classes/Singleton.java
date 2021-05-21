package Classes;
public class Singleton{
    public static void main(String[] args){
        Instance in1 = Instance.getInstance();
        Instance in2 = Instance.getInstance();
        if(in1 == in2){
            System.out.println("Same instances");
        }
        System.out.println("Count of instances :" + Instance.instanceCount);
    }
}

class Instance{
    // Usual role of static vars is to maintain global counts.
    static int instanceCount;

    // getInstance() is static, hence instance needs to be static.
    // Maintains only one variable of type Instance
    private static Instance instance;
    

    // Constructor is private. Can never be instantiated externally.
    // Always to this to make a class uninstantiable.
    private Instance(){
        instanceCount++;
    }

    // static method below is called by main() and inturn invokes private constructor.
    public static Instance getInstance(){
        if(instance == null) 
            instance = new Instance();
        return instance;
    }
}