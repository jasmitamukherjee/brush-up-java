package recursion;

public class StringPermutation {
    public static void perms(String str,String permutation){
        if(str.length()== 0){
        System.out.println(permutation);
        return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            perms(newStr, permutation+curr);
        }
    }
    public static void main(String args[]) {
        String str = "abcd";
        perms(str,  "");
    }
 
}
