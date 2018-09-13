public class Sixteen {
  public static void main(String[] args) {
    for (int a = 1; a <= 10; a++) {
      System.out.println(a + ") Hello world");
    }

    System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

    int j = 1;
    while (j <= 10) {
      System.out.println(j + ") Hello world");
      j++;
    }
    System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
    int i = 1;
    for (; i <= 10;) {
      System.out.println(i + ") Hello world");
      i++;
    }
  }
}
