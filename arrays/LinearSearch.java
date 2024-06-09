package arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght of array");
        size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter numbers : ");
        for(int i=0;i<size;i++)
        num[i]=sc.nextInt();
        System.out.println("Enter no to search : ");
        int x=sc.nextInt();
        int flag=0,i;

        for( i=0;i<size;i++){
if(num[i]==x)
{
    flag=1;
    break;
}
}      
if(flag==0)
System.out.println("Not found");
else
System.out.println("Found at : "+(i+1));
sc.close();


    }
    
}
