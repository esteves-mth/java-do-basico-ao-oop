package Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Mel";
        a1.species = "Cachorro";
        a1.age = 5;
        a1.makeSound();
        a1.showInfo();
        Animal a2 = new Animal();
        a2.name = "Pitico";
        a2.species = "Gato";
        a2.age = 7;
        a2.makeSound();
        a2.showInfo();
    }
}
