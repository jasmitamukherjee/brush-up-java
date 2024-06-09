package practice;
import java.util.*;
public class Find2D {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and cols : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] num=new int[r][c];
        System.out.println("Enter the  nos: ");
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        num[i][j]=sc.nextInt();
        System.out.println("Enter no to search: ");
        int x=sc.nextInt();
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++){
            if(num[i][j]==x)
            System.out.println("Found at ["+(i+1)+"]"+"["+(j+1)+"]");
        }
        }
        sc.close();


        
    }
    
}
