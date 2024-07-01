package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int result = obj.fact(n);
        System.out.println(result);
        sc.close();;
    }

    int fact(int n){
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    
}
