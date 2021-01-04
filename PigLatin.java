import java.util.Scanner;

public class PigLatin {

  public static void main(String[] args) {
    Scanner n = new Scanner( System.in );
    String s, t;
    while( n.hasNextLine() ) {
      Scanner m = new Scanner( n.nextLine() );
      while( m.hasNext() ) {
        t = m.next();
        System.out.print( pigLatinBest(t) + " ");
      }
      System.out.println();
    }
  }

  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    char a;
    if ( s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' ) {
      return s + "hay";
    }
    else {
      a = s.charAt(0);
      return s.substring(1, s.length() ) + a + "ay";
    }
  }

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    if ( s.length() < 3) return pigLatinSimple(s);
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String start = "" + s.charAt(0) + s.charAt(1);
    for(int i = 0; i < digraphs.length; i++) {
      if ( digraphs[i].equals(start) ) {
        return s.substring(2, s.length() ) + start + "ay";
      }
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    if ( s.charAt(0) < 97 || s.charAt(0) > 123) {
      return s;
    }
    else if ( s.charAt( s.length() - 1) < 97 || s.charAt( s.length() - 1) > 123) {
      return pigLatin( s.substring(0, s.length() - 1) ) + s.charAt( s.length() - 1);
    }
    else return pigLatin(s);
  }

}
