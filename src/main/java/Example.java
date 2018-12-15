import tech.bts.movies.model.Movie;
import tech.bts.movies.repository.MovieRepository;
import tech.bts.movies.service.MovieService;

public class Example {

    public static void main(String[] args) {


        MovieService m = new MovieService(new MovieRepository());

        m.addMovie(new Movie("Love", 153, true));
        m.addMovie(new Movie("Ping Pong", 5, false));
        m.addMovie(new Movie("Halloween", 18, true));


        System.out.println(m.getAllMovies());
    }



}
