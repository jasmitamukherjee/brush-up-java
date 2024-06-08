package practice;

import java.util.Scanner;

public class Circle {

    public void circumferance(double r){
        System.out.println("cirumferance : "+((2*r*22)/7));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        double rad=sc.nextDouble();
        Circle obj=new Circle();
        obj.circumferance(rad);
        sc.close();
    }
}
