public class Variables {
    // Shared by all instances
    public static int class_var;
    static final int FINAL_CONST = 100;

    // Unique to every instance
    int instance_var=0;

    public static void main(String [] args){
        
        Variables v1 = new Variables();
        v1.setter();
        System.out.println("v1 instance "+ v1.instance_var);
        System.out.println("class var "+Variables.class_var);

        Variables v2 = new Variables();
        v2.setter();
        System.out.println("v2 instance "+v2.instance_var);
        System.out.println("class var "+Variables.class_var);

        // Shadowing of class_var due to scope precedence
        int class_var = 74;
        System.out.println(class_var);
        
    }
    void setter(){
        instance_var+=1;
        class_var += 1;
    }
}
