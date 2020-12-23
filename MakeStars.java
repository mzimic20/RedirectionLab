import java.util.Scanner;

public class MakeStars {

  public static void main(String[] args) {
    Scanner n = new Scanner( System.in );
    String s, t;
    while( n.hasNextLine() ) {
      Scanner m = new Scanner( n.nextLine() );
      while( m.hasNext() ) {
        t = m.next();
        for(int i = 0; i < t.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }

}
