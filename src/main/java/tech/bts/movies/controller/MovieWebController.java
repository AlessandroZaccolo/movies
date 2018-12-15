package tech.bts.movies.controller;


import com.github.jknack.handlebars.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bts.movies.model.Movie;
import tech.bts.movies.service.MovieService;
import tech.bts.movies.util.HandlebarsUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(path = "/movies")
public class MovieWebController {

    private MovieService movieService;

    @Autowired
    public MovieWebController(MovieService movieService){
        this.movieService = movieService;
    }

    @RequestMapping(method = GET)
    public String getAllMovies() throws IOException {

        Template template = HandlebarsUtil.compile("movie-list");

        Map<String, Object> values = new HashMap<>();
        values.put("movies", movieService.getAllMovies());

        return template.apply(values);
    }

    @RequestMapping(method = POST, path = "/add")
    public void addMovie(Movie movie, HttpServletResponse response) throws IOException {

        movieService.addMovie(movie);
        response.sendRedirect("/movies");
    }






}
