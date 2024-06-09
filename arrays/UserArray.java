package arrays;
import java.util.*;
public class UserArray {

   
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght of array");
        size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter numbers : ");
        for(int i=0;i<size;i++)
        num[i]=sc.nextInt();
        System.out.println("You entered : ");
        for(int i=0;i<size;i++)
        System.out.println(num[i]);
        sc.close();


    }
    
}
