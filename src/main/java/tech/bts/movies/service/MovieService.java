package tech.bts.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bts.movies.model.Movie;
import tech.bts.movies.repository.MovieRepository;

import java.util.*;

@Service
public class MovieService {

    private MovieRepository movieRepo;
    private long movieId;
    private Movie movie;

    @Autowired
    public MovieService(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
        movieId = 0;
    }


    public void addMovie(Movie movie){
        movieRepo.getMovieMap().put(movieId, movie);
        movieId++;
    }

    public List<Movie> getAllMovies(){
        return new ArrayList<>(movieRepo.getMovieMap().values());
    }


    public Movie getMovieById(long movieId) {

        return movieRepo.getMovieById(movieId);
    }

}
