import java.util.Scanner;
import java.io.*;
public class IO {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args)throws IOException {

        // Note the print and println
        System.out.print("Hi");
        System.out.println(", I am ssd.");
        System.out.println("Output is cool.");

        // Always on console
        System.err.println("This is std error stream.");

        int size;
        System.err.print("Enter the array size:");
        size = sc.nextInt();
        float [] a = new float[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextFloat();
        }
        System.out.println("Array is:");
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " ");
        }

        // Note sc.next() and not sc.nextLine().
        System.err.println("Enter another number:");
        try{
            String s = sc.nextLine();
            String s1 ="10";
            int n = Integer.parseInt(s);                           // Anamoly
            System.out.println("int from str is "+ n);
        }catch(Exception e){

            System.out.println("Cannot read from scanner an integer !!! ");
        }
        brreader();

    }
    static void brreader(){

        // create a BufferedReader using System.in
        BufferedReader br = new
        BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum=0;

        System.out.println("Enter numbers, 0 to quit.");
        do {
            try {
                str = br.readLine();
                i = Integer.parseInt(str);
            } catch(IOException e) {
                System.out.println("Invalid format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while(i != 0);
    
    }
}







 
// java <Classname> >> output.txt to append std outputstream to the file.
// java <Classname> > output.txt to overwrite the file.