public class Ops {
  public static int sum (int x, int y) {
    return x + y;
  }

  public static int multiply (int x, int y) {
    return x * y;
  }

  public static int power (int x, int y) {
    int powerNum = y-1;
    return x * x * powerNum;
  }

  public static void main(String [] args) {

    int first;
    first = 1;

    int second;
    second = 2;
// these are local variables
    int result = sum(first, second);

    System.out.println( result );
    System.out.println( sum(1, 2) );
    System.out.println( multiply(4, 5) );
    System.out.println( power(4, 2) );
  }
}

// main does not return anything, so its type is 'void'
