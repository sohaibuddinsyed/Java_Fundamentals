
public class Methods {
    public static void main(String args[]){
        Sample s1 = Sample.objectcreate();
    }

}
class Sample{
    static Sample objectcreate(){
        return new Sample();
    }
}