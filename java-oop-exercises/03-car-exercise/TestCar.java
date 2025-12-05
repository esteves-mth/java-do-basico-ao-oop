public class TestCar{
    public static void main(String[] args) {
        Car c1 = new Car("Volkswagen", "Gol", 1990, 12000);
        Car c2 = new Car("Honda", "Civic", 2015, 90000);
        Car c3 = new Car("Toyota", "Versa", 2020, 100000);
        System.out.println(c1.getModel());
        System.out.println(c2.getBrand());
        System.out.println(c1.getPrice());
        System.out.println(c3.getYear());
        System.out.println(c3.isVintage());
        System.out.println(c1.isVintage());
        System.out.println(c2.calculateDepreciation());
        System.out.println(c3.calculateDepreciation());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
