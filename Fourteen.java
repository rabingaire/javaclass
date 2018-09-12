public class Fourteen {
  public static void main(String[] args) {
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World"); >>>>>> this approach is bad
    int a = 0;
    while (a < 10) {
      System.out.println(a + ") Hello");
      // a = a + 1;
      // a += 1;
      a++;
    }

    System.out.println("<<<<<<<<<<<<<<<<");
    int b = 1;
    while (b <= 10) {
      System.out.println(b + ") World");
      b++;
    }

    System.out.println("<<<<<<<<<<<<<<<<");
    int c = 1;
    while (c <= 10) {
      System.out.println(c + ") World");
      ++c;
    }
  }
}
