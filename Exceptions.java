public class Exceptions {
    
    public static void main(String[]args){
        try{
            func(10,"apple");
        } catch(IllegalArgumentException e){
            System.out.println("Illegal");
        }
    }

    public void func(int a, int b){
        System.out.println(a);
    }
}