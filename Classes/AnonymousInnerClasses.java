// package Classes;

public class AnonymousInnerClasses {
    public static void main(String args[]){
        MyAnonymousInnerClass maic1 = new MyAnonymousInnerClass();
        maic1.start();
    }
}

class MyAnonymousInnerClass {
    private int a=10;

    void start(){
        AnonymousClassInterface an = new AnonymousClassInterface(){
            private int b=0;
            public void printer(){
                System.out.println("private int a in OuterClass is: "+ a);
                System.out.println("private int b in NestedClass is: "+ b);
            }
        };
        an.printer();
    }
    interface AnonymousClassInterface{
        void printer();
    }

}