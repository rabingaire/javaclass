public class Fifteen {
  public static void main(String[] args) {
    int a = 1;
    do {
      System.out.println(a + ") Hello World");
      a += 1;
    } while (a > 10); // this loop runs at least once even though the condition is false

    int b = 1;
    while (b > 10) {
      System.out.println(b + ") Hello World");
      b += 1;
    }
  }
}
