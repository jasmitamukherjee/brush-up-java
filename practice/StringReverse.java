package practice;

class StringReverse{

public  static void  main(String args[]) {
    String s="jasmita";
    String reverse=reverse(s);
    System.out.println(reverse);

    
}

public static String reverse(String s){
    if(s.length()==1)
    return s;
    else
    {
        char ab=s.charAt(0);
        String next=reverse(s.substring(1));
        return next+ab;

    }

}
}