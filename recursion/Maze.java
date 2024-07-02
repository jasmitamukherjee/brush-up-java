package recursion;

public class Maze {
    public static int count(int i,int j,int n,int m){
        if(i==n-1 && j==m-1)
        return 1;
        if(i==n || j==m)
        return 0;
        
        int downPaths=count(i+1,j,n,m);
        int rightPath=count(i,j+1,n,m);
        return downPaths+rightPath;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int tot=count(0, 0, n, m);
        System.out.println(tot);
    }
}
