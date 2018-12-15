package tech.bts.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.bts.movies.model.Movie;
import tech.bts.movies.repository.MovieRepository;
import tech.bts.movies.service.MovieService;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CommandLineRunner createDummyData(MovieService movieService){
        return args -> {

            movieService.addMovie(new Movie("Lost in translation",104, false));
            movieService.addMovie(new Movie("Eyes wide shut", 165,true));


        };
    }

}
