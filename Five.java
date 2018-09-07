public class Five {
  public static void main(String[] args) {
    // Operators
    // +
    int a = 10 + 20 + 30;
    int b = 10 - 20;
    int c = 2 * 2;
    int d = 3 / 2;
    int e = 3 % 2; // modulo gives reminder
    int f = a++; // first it prints and than adds // this line is similar to int a = a + 1;
    int g = ++a; // first adds and than prints // this line is same to int a = a + 1;
    int h = c--;
    int i = --c;

    float j = 3 / 2;
    // float k = 3.0 / 2; ---> we cannot do this because we are dividing double and
    // int
    // and assigining it to float
    float k = 3.0f / 2; // we can divide float and int
    float l = 2 / 3.0f; // we can do this as well

    double m = 3.0 / 2;

    // float n = 3.0 - 2; --> we cannot do this because we are sub double and int
    // and assigining it to float
    float n = 3.0f - 2;
    double o = 3.0000 - 2;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(l);
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);
  }
}
