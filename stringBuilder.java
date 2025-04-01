import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tony");

        //chat at index
        System.out.println(sb.charAt(0));
        
        //replace any char at any index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert function:insert any char at given index
        sb.insert(0,'S');
        System.out.println(sb);

        //delete function
        sb.delete(2,3);
        System.out.println(sb);

        //append function:adds char at last
        sb.append("e");
        System.out.println(sb);
        System.out.println(sb.length());


        //converting int n into string
        String str = integer.toString(variable name of integer);
        //other way
        String.valueOf(variable_name of integer);
    }
    
}
