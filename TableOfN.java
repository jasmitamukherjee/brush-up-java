import java.util.Scanner;

public class TableOfN {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose table has to be printed : ");
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" X "+ n +" = "+ (i*n));
        }
        sc.close();
    }
}
