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
      sb.insert(1, 'K');
      System.out.println(sb);
      sb.delete(1, 2);
      System.out.println(sb);
      sb.deleteCharAt(4);
      System.out.println(sb);
      sb.append('x');
      System.out.println(sb);
      System.out.println(sb.length());
    }

    
}