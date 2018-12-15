package tech.bts.movies.controller;

import com.github.jknack.handlebars.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bts.movies.model.Movie;
import tech.bts.movies.service.MovieService;
import tech.bts.movies.util.HandlebarsUtil;

import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(path = "/api/movies")
public class MovieApiController {

    private MovieService movieService;


    @Autowired
    public MovieApiController(MovieService movieService){

        this.movieService = movieService;
    }


    @RequestMapping(method = POST)
    public void addMovie(Movie movie){

        this.movieService.addMovie(movie);

    }

    @RequestMapping(method = GET, path = "/{movieId}")
    public Movie getMovieById(@PathVariable Long movieId) {

        return this.movieService.getMovieById(movieId);
    }



}
