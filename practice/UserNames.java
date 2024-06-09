package practice;
import java.util.*;
public class UserNames {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int n=sc.nextInt();
        String[] names=new String[n];
        System.out.println("enter the names : ");
        for(int i=0;i<n;i++)
        names[i]=sc.nextLine();

        System.out.println("You entered : ");
        for(int i=0;i<n;i++)
        System.out.println(names[i]);
        sc.close();

    }
    
}
