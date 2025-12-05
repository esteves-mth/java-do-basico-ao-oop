public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Square s = new Square(6);

        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
        System.out.println(c.calculatePerimeter());
        System.out.println(s.calculatePerimeter());
    }
}
