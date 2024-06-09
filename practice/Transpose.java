package practice;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and cols : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] num=new int[r][c];
        System.out.println("Enter the numners now: ");
        for(int i =0;i<r;i++)
        for(int j=0;j<c;j++)
        num[i][j]=sc.nextInt();
        System.out.println("Transpose is : ");
        for(int i=0;i<c;i++){
        for(int j=0;j<r;j++)
        System.out.print(num[j][i]+"\t");
System.out.println();
        }
sc.close();
    }
    
}
