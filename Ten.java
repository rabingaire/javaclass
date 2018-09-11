public class Ten {
  public static void main(String[] args) {
    int a = 12;

    switch (a) {
    case 12:
      break;
    case 13:
    case 15:
      System.out.println("I am 13 or I am 15");
      break;
    case 14:
      System.out.println("I am 13");
      break;
    default:
      System.out.println("I am default");
    }
  }
}
