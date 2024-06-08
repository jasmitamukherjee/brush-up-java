import java.util.Scanner;

public class Factorial {
    public int factorial(int n){
        if(n<=0)
        return 0; 
        int p=1;
        for(int i=1;i<=n;i++){
                p*=i;
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find factorial : ");
        int n=sc.nextInt();
        Factorial obj=new Factorial();
       System.out.println("Factorial : "+  obj.factorial(n));
        sc.close();
    }
    
}
