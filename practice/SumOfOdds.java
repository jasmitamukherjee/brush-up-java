package practice;

import java.util.Scanner;

public class SumOfOdds {
    public int sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2 == 1)
            s+=i;
        }
        return s;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n=sc.nextInt();
        SumOfOdds obj=new SumOfOdds();
        System.out.println("Sum of all the odds : "+obj.sum(n));
        sc.close();

    }
    
}
