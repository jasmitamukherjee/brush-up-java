package practice;
import java.util.*;
public class Spiral {
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
        int rowStart=0;
        int rowEnd=r-1;
        int colStart=0;
        int colEnd=c-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(num[rowStart][col] + " ");
            }
            rowStart++;
  
  
            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(num[row][colEnd] +" ");
            }
            colEnd--;
  
  
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(num[rowEnd][col] + " ");
            }
            rowEnd--;
  
  
            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(num[row][colStart] + " ");
            }
            colStart++;
  
  
            System.out.println();
            sc.close();
        }
  

        
    }
}
