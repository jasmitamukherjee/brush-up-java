import java.util.*;
public class AdvancedPatterns {

    public static void main(String args[]){
        //butterfly 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter rows : ");
        // int n=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     //first half
        //     for(int j=1;j<=i;j++)
        //     System.out.print("*");
        //     for(int sp=1;sp<=(2*(n-i));sp++)
        //     System.out.print(" ");
        //     for(int j=1;j<=i;j++)
        //     System.out.print("*");
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     //second half
        //     for(int j=1;j<=i;j++)
        //     System.out.print("*");
        //     for(int sp=(2*(n-i));sp>0;sp--)
        //     System.out.print(" ");
        //     for(int j=1;j<=i;j++)
        //     System.out.print("*");
        //     System.out.println();
        // }

        //rhombus
        //  Scanner sc=new Scanner(System.in);
        // System.out.println("Enter rows : ");
        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++)
        //     System.out.print(" ");
        //     for(int j=1;j<=n;j++)
        //     System.out.print("*");
        //     System.out.println();
        // }

        //triangle 
        //     Scanner sc=new Scanner(System.in);
        // System.out.println("Enter rows : ");
        // int n=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=(n-i);j++)
        //     System.out.print(" ");
        //     for(int j =1;j<=i;j++)
        //     System.out.print(i+" ");
        //     System.out.println();
        // }

        //bigger triangle
//             Scanner sc=new Scanner(System.in);
//         System.out.println("Enter rows : ");
//         int n=sc.nextInt();

// for(int i=1;i<=n;i++){
//             for(int j =1;j<=(n-i);j++)
//             System.out.print(" ");
//             for(int j =i;j>=1;j--)
//             System.out.print(j);
//             for(int j =2;j<=i;j++)
//             System.out.print(j);

//             System.out.println();
//         }

//star pattern diamond
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows : ");
int n=sc.nextInt();

for(int i=1;i<=n;i++){
    //upper half 
    for(int j =1;j<=(n-i);j++)
    System.out.print(" ");
    for(int j =1;j<=2*i-1;j++)
    System.out.print("*");
 

    System.out.println();
}


for(int i=n;i>=1;i--){
    //lower half 
    for(int j =1;j<=(n-i);j++)
    System.out.print(" ");
    for(int j =1;j<=2*i-1;j++)
    System.out.print("*");
 


    System.out.println();
}


    }
    
}
