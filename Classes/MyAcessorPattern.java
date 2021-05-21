// package Classes;                                                    // Anamoly

// The use of accessors is an example of a design pattern that's commonly used by Java programmers.
public class MyAcessorPattern {
    public static void main(String args[]){
        MyClass m1 = new MyClass();
        m1.setSecretVar(10);
        m1.setSecretPermission(true);
        System.out.println("m1.getSecretVar(): " + m1.getSecretVar()); 
        System.out.println("m1.isSecretPermission(): " + m1.isSecretPermission()); 
    }
}

class MyClass{
    // Instance variables
    private int secretvar;
    private String secretkey;
    private boolean secretpermission;

    // getters and setters are usually named getFieldName() and setFieldName()

    public void setSecretVar(int a){
        this.secretvar = a;
    }
    public void setSecretKey(String a){
        this.secretkey = a;
    }
    public void setSecretPermission(boolean a){
        this.secretpermission = a;
    }
    public int getSecretVar(){
        return this.secretvar;
    }
    public String getSecretKey(){
        return this.secretkey;
    }
    // Boolean getter is different
    public boolean isSecretPermission(){
        return this.secretpermission;
    }
}