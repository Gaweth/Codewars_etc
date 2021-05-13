package interfejsy.zadanie2;

public class Main {
    public static void main(String[] args) {
        // new Movie(title,director,yearOfRelease, genre,publisher);
        Movie movie = new MovieCreator()
                .setDirector("dfg")
                .setGenre("gdfgdf")
                .setPublisher("fdghfdh")
                .setTitle("fgdfgh")
                .setYearOfRelease(1990)
                .createMovie();

        System.out.println(movie);
    }
}
