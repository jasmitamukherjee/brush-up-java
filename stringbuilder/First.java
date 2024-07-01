package stringbuilder;

/**
 * First
 */
public class First {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Jasmita");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
      sb.setCharAt(0, 'L');
      System.out.println(sb);
    }

    
}