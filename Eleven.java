public class Eleven {
  public static void main(String[] args) {
    boolean a = (12 > 12) && (12 < 45); // false
    boolean b = (12 > 12) || (12 < 45); // true
    boolean c = (12 == 12) && (13 < 34); // true
    boolean d = (12 < 1) || (12 > 45); // false
    boolean e = !((12 < 1) || (12 > 45)); // true
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
