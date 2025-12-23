package Student;

public class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Matheus";
        s1.age = 15;
        s1.grade = 75;
        s1.showInfo();

        Student s2 = new Student();
        s2.name = "Esteves";
        s2.age = 15;
        s2.grade = 100;
        s2.showInfo();
    }
}
