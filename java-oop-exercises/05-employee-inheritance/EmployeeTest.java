public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("John", "E001", 5000);
        Manager m = new Manager("Peter", "M001", 3000);
        Salesperson s = new Salesperson("Jordan", "S001", 4000);

        System.out.println(e.calculateSalary());
        System.out.println(m.calculateSalary());
        System.out.println(s.calculateSalary());
    }
}
