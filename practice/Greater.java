package practice;

import java.util.Scanner;

public class Greater {

    public void greater(int a,int b){
        if(a<0 || b < 0)
        return;
        if(a>b)
        System.out.println(a+" is greater ");
        else if(b>a)
        System.out.println(b+" greater ");
        else
        System.out.println("Equal");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos to compare : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Greater obj=new Greater();
        obj.greater(a, b);
        sc.close();
    }
}
