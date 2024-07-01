package recursion;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Power obj = new Power();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number and power : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result = obj.pow(n,m);
        System.out.println(result);
        sc.close();

    }
    int pow(int n,int m){
        if(m==0){
            return 1;
        }
        else{
            return n*pow(n,m-1);
        }
    }
}
