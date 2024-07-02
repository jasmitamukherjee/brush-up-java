package recursion;

public class Tiles {

    public static int place(int n,int m){
        if(n==m)
        return 2;
        if(n<m)
        return 1;
        int vertical=place(n-m,m);
        int horizontal = place(n-1,m);
        return vertical+horizontal;
    }
    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(place(n, m));
    }
 
    
}
