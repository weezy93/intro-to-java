public class Rectangle {
  public int width;
  public int length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public int area() {
    return width * length;
  }

  public static void main(String [] args) {
    Rectangle square = new Rectangle(12, 12);
    System.out.println(square.area());
  }
}
