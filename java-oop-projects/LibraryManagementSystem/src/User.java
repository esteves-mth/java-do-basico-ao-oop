public class User {
    private String nome;
    private String ID;

    public User(String nome, String ID){
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return this.nome;
    }
    public String getID(){
        return this.ID;
    }
}
