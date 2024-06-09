package arrays;
import java.util.*;


public class TwoDArrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows and cols : ");
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       System.out.println("Input the numbers : ");
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }



System.out.println("You entered : ");
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+"\t");
               }
               System.out.println();
           }

           sc.close();
   }
}
