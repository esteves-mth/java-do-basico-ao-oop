package Animal;

class Animal{
    String name;
    String species;
    int age;

    void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + "years old");
    }

    void makeSound(){
        if (species.equals("Gato") || species.equals("gato") || species.equals("cat") || species.equals("Cat")){
            System.out.println("Miau!");
        }
        else if (species.equals("Cachorro") || species.equals("cachorro") || species.equals("dog") || species.equals("Dog")){
            System.out.println("Au! Au!");
        }
    }
}
