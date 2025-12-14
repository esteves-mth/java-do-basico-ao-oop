public class Ave extends Animal{


    public Ave(String nome, String sexo, int idade, int numeropatas) {
        super(nome, sexo, idade, numeropatas);
    }

    @Override
    public String fazerSom() {
        return "Pia";
    }

    @Override
    public String mover() {
        return "Voa";
    }
}
