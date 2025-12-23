package Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Homem-Aranha 2";
        m1.genre = "Herói";
        m1.year = 2004;
        m1.showInfo();
        m1.getAgeOfMovie(2025);
        Movie m2 = new Movie();
        m2.title = "Homem-Aranha 1";
        m2.genre = "Herói";
        m2.year = 2002;
        m2.showInfo();
        m2.getAgeOfMovie(2025);
    }
}
