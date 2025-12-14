import java.util.ArrayList;
public class ZoologicoTest {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Mamifero("Leão", "Masculino", 10, 4));
        zoo.add(new Ave("Bem-te-vi", "Masculino", 4, 2));
        zoo.add(new Reptil("Cobra", "Masculino", 7, 0));

        for (Animal animal: zoo) {
            System.out.println(animal.getNome() + ": " + animal.fazerSom());
        }
        for (Animal animal: zoo) {
            System.out.println();
            animal.getInfo();
        }

    }
}
