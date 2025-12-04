public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    } public void setRadius(double radius) {
        if (radius >= 0){
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    public double getArea(){
        double d = Math.pow(getRadius(), 2);
        return (d * Math.PI);
    }

    public double getPerimeter(){
        return (2*Math.PI*getRadius());
    }

    public boolean isLargerThan(Circle other){
        return (this.getRadius() > other.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
