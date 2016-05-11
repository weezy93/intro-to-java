public class ReverseString {
  public static String reversedString;


  public static String reverse(String string) {
    reversedString = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      System.out.println(string.charAt(i));
      reversedString += string.charAt(i);
    }
    return reversedString;
  }

  public static void main(String [] args) {
    System.out.println(reverse("Hello World"));
  }

}
