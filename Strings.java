import java.util.StringTokenizer;

public class Strings {
public static void main(String args[]){
        MyStringTokenizer m = new MyStringTokenizer();
        m.Tokenizer();
    }
}

class MyStringTokenizer{
    void Tokenizer(){
        final String s = "Name : Sohaib, Shortname : ssd, dob : 11-01-2000";
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Total Tokens are : " + st.countTokens());
        WrapperClasses.indent("Tokenizer with delimiter in .nextToken()");
        while(st.hasMoreTokens()){
            System.out.print("Key "+st.nextToken(":"));
            System.out.println(" Value "+ st.nextToken(","));
            // if(Boolean.parseBoolean(st.nextToken("-"))){
            //     System.out.println(st.nextToken("-") + st.nextToken("-")  + st.nextToken());
            // }
        }

        // Ignores delimited chars in output
        // Note constructor call
        WrapperClasses.indent("Tokenizer with delimiter in constructor");
        StringTokenizer st2 = new StringTokenizer(s,",:");
        while(st2.hasMoreTokens()){
            System.out.print("Key "+st2.nextToken());
            System.out.println(" Value "+ st2.nextToken());
            // if(Boolean.parseBoolean(st.nextToken("-"))){
            //     System.out.println(st.nextToken("-") + st.nextToken("-")  + st.nextToken());
            // }
        }
    }
}