import java.util.Scanner;

public class SumOfNaturalNos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit : ");
        int n= sc.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural nos: "+sum);
        sc.close();
    }
    
}
