import java.util.Arrays;
import java.util.Scanner;
import Classes.HelloWorld;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        HelloWorld.hello();
        // stringArray();
        // intArray();

        BuiltinArrays b = new BuiltinArrays();
        b.builtinArrays();
    }
    static void intArray(){
        System.out.print("Enter the size of 2d array : ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("\nEnter arrray elemnts: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        printArray(a,n);
    }
    static void stringArray(){
        System.out.print("Enter the size of the string array:");
        int n2 = sc.nextInt();
        String arr[] = new String[n2];
        for(int i=0;i<n2;i++){
            arr[i]=sc.next();
        }
        printArray(arr);
    }
   
    public static <t> void printArray(t xx []){
        System.out.println("Array is:");
        for( t  x : xx){
            System.out.print(x+" ");
        }
    }
    
    public static void printArray(int [][] xx, int n){
        System.out.println("Array is:");
        for( int[] x : xx){
            System.out.println();
            for( int  y : x){
                System.out.print(y+" ");
            }
        }
    }

}
class BuiltinArrays{
    void builtinArrays(){
        int[] a = new int[10]; 
        Arrays.setAll(a, i -> (int)(Math.random() * 100) + 1);
        // MyArrays.printArray(a);                         //Error
    }
}
