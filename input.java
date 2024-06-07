
import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter your name : ");
        // String name = sc.nextLine();
        // System.out.println("You entered : "+ name);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
        sc.close();
    }
}
