package com.movieTicketBooking.ticketBooking.User;

import com.movieTicketBooking.ticketBooking.Movie.Movie;
import com.movieTicketBooking.ticketBooking.Movie.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

public class UserService {

    @RestController
    @RequestMapping("/api/user")
    public class UserController {
        private final MovieRepository movieRepository;

        public UserController(MovieRepository movieRepository) {
            this.movieRepository = movieRepository;
        }

        @GetMapping("/search/{movie_name}")
        public List<Optional<Movie>> searchMovie(@PathVariable("movie_name") String movie_name){
            return List.of(movieRepository.searchMovieByName(movie_name));
        }
    }
}
