package practice;
import java.util.*;
public class MaxMin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array : ");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("enter the nos: ");
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
        num[i]=sc.nextInt();
        if(num[i]>max)
        max=num[i];
        if(num[i]<min)
        min=num[i];

        }
        
        System.out.println("Maximum no and min no are : "+max+" "+min);
   sc.close();
    }
    
}
