package practice;

import java.util.Scanner;

public class Average {
    public double avg(double a,double b,double c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three nos for averaging  : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        double c=sc.nextDouble();
        Average obj=new Average();
        System.out.println("Average : "+obj.avg(a, b, c));
        sc.close();


    }
    
}
