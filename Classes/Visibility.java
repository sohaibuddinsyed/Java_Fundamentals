package Classes;

public class Visibility {
    public static void main(String args[]){
        MyVisibilityClass mvc1 = new MyVisibilityClass();
        System.out.println(mvc1.a);
        System.out.println(mvc1.c);
    }
}
class MyVisibilityClass{
    // Default access - Visible to all classes within package
    int a = 0;
    // Private - Hidden
    private int b;
    // Public -  Visible to all classes
    public int c = 1;

}