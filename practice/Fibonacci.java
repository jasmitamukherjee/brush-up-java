package practice;

import java.util.Scanner;

public class Fibonacci {

    public int fib(int n){
        if(n<0 || n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return fib(n-1)+fib(n-2);
    }

    public static void main(String args[]){
        Fibonacci obj=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.print(obj.fib(i)+" ");
        sc.close();

    }
    
}
