public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    } public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side*this.side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*this.side;
    }
}
