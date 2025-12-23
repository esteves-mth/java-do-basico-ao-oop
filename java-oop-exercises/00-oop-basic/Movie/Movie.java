package Movie;

class Movie{
    String title;
    String genre;
    int year;

    void getAgeOfMovie(int currentYear){
        System.out.printf("O filme '%s' tem %d anos.\n", title, currentYear - year);
    }

    void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
    }
}
