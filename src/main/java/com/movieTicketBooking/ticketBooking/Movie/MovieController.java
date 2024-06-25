package com.movieTicketBooking.ticketBooking.Movie;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

        private final MovieService movieService;
        public MovieController(MovieService movieService) {

            this.movieService = movieService;
        }
        @GetMapping("/getAll")
        public List<Movie> getAllMovies(){

            return movieService.getAll();
        }
        @PostMapping("/add")
        public void addMovie(@RequestBody Movie movie){
            movieService.addMovie(movie);
        }

        @DeleteMapping("/delete/{movieId}")
        public void deleteMovie(@PathVariable("movieId") Integer movieId){
            movieService.deleteMovie(movieId);
        }
        @PutMapping("/{movieId}")
        public void updateMovie(
                @PathVariable("movieId") Integer movieId,
                @RequestParam(required = false) String movieName,
                @RequestParam(required = false) String movieGenre){
            movieService.updateMovie(movieId,movieName,movieGenre);
        }


}

