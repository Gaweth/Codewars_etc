package interfejsy.zadanie2;

public class MovieCreator  {

    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String publisher;



    public MovieCreator setTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieCreator setDirector(String director) {
        this.director = director;
        return this;
    }


    public MovieCreator setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        return this;
    }

    public MovieCreator setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public MovieCreator setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public  Movie createMovie(){
        Movie movie = new Movie(title,director,yearOfRelease, genre,publisher);
        return movie;

    }
}
