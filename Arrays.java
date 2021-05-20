import java.util.Scanner;
import Classes_in_java.HelloWorld;
public class Arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        // stringArray();
        intArray();
        HelloWorld.hello();
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
   
    static <t> void printArray(t [] xx){
        System.out.println("Array is:");
        for( t  x : xx){
            System.out.print(x+" ");
        }
    }
    
    static void printArray(int [][] xx, int n){
        System.out.println("Array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(xx[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
