package strings;
import java.util.*;
public class CompareStrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings to compare : ");
        String a=sc.nextLine();
        String b=sc.nextLine();
        // if(a.compareTo(b)>0 || a.compareTo(b)<0)
        // System.out.println("Not Equal");
        // else
        // System.out.println("Equal");
        if(a.equalsIgnoreCase(b))
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
        sc.close();

    }
    
}
