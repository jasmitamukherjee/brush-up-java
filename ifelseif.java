import java.util.Scanner;

public class ifelseif {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to check : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2)
        System.out.println("First number greater");
        else if(num1<num2)
        System.out.println("Second number is greater");
        else
        System.out.println("Both are equal");
        sc.close();
    }
    
}
