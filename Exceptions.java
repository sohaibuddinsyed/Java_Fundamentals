public class Exceptions {
    
    public static void main(String[]args){
        try{
            // func(10,10k);
        } catch(IllegalArgumentException e){
            System.out.println("Illegal");
        }
    }

    public static void func(int a, int b){
        System.out.println(a);
    }
}