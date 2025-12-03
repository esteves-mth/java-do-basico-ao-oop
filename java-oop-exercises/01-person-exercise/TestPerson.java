public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Matheus", 15, "P001");
        Person p2 = new Person("Jake", -1, "P002");

        System.out.println(p1);
        System.out.printf("%s %d %s\n", p1.getName(), p1.getAge(), p1.getId());
        System.out.printf("%s %d %s\n", p2.getName(), p2.getAge(), p2.getId());
        p2.setAge(20);
        System.out.println(p2.getAge());
        System.out.printf("Adult? %b\n", p1.isAdult());
        System.out.printf("Adult? %b\n", p2.isAdult());
    }
}
