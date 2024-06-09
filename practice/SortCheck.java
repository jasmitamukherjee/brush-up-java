package practice;
import java.util.*;
public class SortCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int flag=0,n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
         

        }

        for(int i=0;i<n;i++)
        {
            if(num[i+1]<num[i])
            {
            flag=1;
            break;
            }
        }
        if(flag==1)
        System.out.println("Not in ascending order");
        else
        System.out.println("order is ok");
        sc.close();
    }
    
}
