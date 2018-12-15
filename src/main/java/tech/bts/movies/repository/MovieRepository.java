package tech.bts.movies.repository;

import org.springframework.stereotype.Repository;
import tech.bts.movies.model.Movie;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MovieRepository {

    private Map<Long, Movie> movieMap;
    private long movieId;


    public MovieRepository() {
        movieMap = new HashMap<>();
        movieId = 0;
    }

    public Map<Long, Movie> getMovieMap() {
        return movieMap;
    }

    public Movie getMovieById(long movieId) {
        return movieMap.get(movieId);
    }




}
