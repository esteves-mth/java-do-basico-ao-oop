package Game;

public class GameMain {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.name = "Minecraft";
        g1.genre = "Aventura";
        g1.price = 80.00;
        g1.applyDiscount(20);
        g1.showInfo();
        Game g2 = new Game();
        g2.name = "EAFC 26";
        g2.genre = "Esporte";
        g2.price = 550.00;
        g2.applyDiscount(25);
        g2.showInfo();
    }
}
