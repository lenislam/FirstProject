package databaseConnection;

public class Movie {

    private int id;
    private String title;
    private int raleaseYear;
    private String genre;
    private String mpaaRating;

    public Movie(int id, String title, int raleaseYear, String genre, String mpaaRating) {
        this.id = id;
        this.title = title;
        this.raleaseYear = raleaseYear;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getRaleaseYear() {
        return raleaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }
}
