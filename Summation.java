import java.util.Scanner;

public class Summation {

    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        Summation obj=new Summation();
        System.out.println("Sum of the two nos : "+ obj.sum(a,b));
        sc.close();
    }
    
}
