import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an option : \n1. Namaste\n2. Hello\n3. Bonjour");
        System.out.println("Your choice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Namaste !");
                
                break;
                case 2:
            System.out.println("Hello !");
                
                break;
                case 3:
            System.out.println("Bonjour !");
                
                break;
        
            default:
            System.out.println("You might have pressed an invalid option");
                break;
        }  
        sc.close();  
    }

}
