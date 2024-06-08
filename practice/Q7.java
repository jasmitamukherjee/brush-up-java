package practice;

import java.util.Scanner;

public class Q7 {
    Scanner sc=new Scanner(System.in);

    public void sum(){
        int sn=0;
        int sp=0;
        int z=0;

        for(;;){
            System.out.println("Fo you want to stop? Press Y to stop and N to continue.");
            String ch= sc.next();
            if(ch.equals("Y"))
            break;
           else{
            int n=sc.nextInt();
            if(n<0)
            sn++;
            else if(n==0)
            z++;
            else 
            sp++;
            
        }


        }
        System.out.println("Count of negative , positive and zeros : "+sn+" "+sp+" "+z);
    }
    public static void main(String args[]){
        Q7 obj=new Q7();
        obj.sum();
    }
}
