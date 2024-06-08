import java.util.Scanner;

public class FunctionName {
    Scanner sc=new Scanner(System.in);

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        FunctionName obj=new FunctionName();
        obj.name();

        sc.close();
    
    
    }

    public void name(){
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name);    
    }

}
