import java.util.Scanner;

public class Patterns {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //rectangle
        // System.out.println("Enter rows and cols : ");
        // int rows= sc.nextInt();
        // int cols= sc.nextInt();

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=cols;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //hollow rectangle
        // System.out.println("Enter rows and cols : ");
        // int rows= sc.nextInt();
        // int cols= sc.nextInt();
        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=cols;j++){
        //         if(i==1||j==1||i==rows||j==cols)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //right angled triangle 
        //  System.out.println("Enter rows : ");
        // int rows= sc.nextInt();
        // for(int i=1;i<=rows;i++){
        //     for(int j = 1;j<=i;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        //inverted triangle
        //  System.out.println("Enter rows : ");
        // int rows= sc.nextInt();
        // for(int i =rows;i>=1;i--){
        //     for(int j=1;j<=i;j++)
        //     System.out.print("*");
        //     System.out.println();
        // }

        //mirror triangle 
        //   System.out.println("Enter rows : ");
        // int rows= sc.nextInt();
        // for(int i=1;i<=rows;i++){
        //     for(int sp=1;sp<=rows-i;sp++)
        //     System.out.print(" ");
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
           
        //     System.out.println();
        // }

        //nos 
        //     System.out.println("Enter rows : ");
        // int rows= sc.nextInt();

        // for(int i =1;i<=rows;i++){
        //     for(int j=1;j<=i;j++)
        //     System.out.print(j+" ");
        //     System.out.println();
        // }

        //interted nos
        //      System.out.println("Enter rows : ");
        // int rows= sc.nextInt();

        // for(int i =rows;i>=0;i--){
        //     for(int j=1;j<=i;j++)
        //     System.out.print(j+" ");
        //     System.out.println();
        // }

        //continuous nos
        // int k=0;
        //       System.out.println("Enter rows : ");
        // int rows= sc.nextInt();

        // for(int i =1;i<=rows;i++){
        //     for(int j=1;j<=i;j++)
        //     System.out.print((++k)+" ");
        //     System.out.println();
        // }

        //0-1 triangle 
              System.out.println("Enter rows : ");
        int rows= sc.nextInt();

        for(int i =1;i<=rows;i++){
            for(int j=1;j<=i;j++)
            if((i+j) % 2==0)
            System.out.print(" 1 ");
            else
            System.out.print(" 0 ");
            System.out.println();
        }

        sc.close();
    }
    
}
