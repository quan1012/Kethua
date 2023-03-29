public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.0,5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle("red",false,2.0,5.0);
        System.out.println(rectangle);
    }
}
